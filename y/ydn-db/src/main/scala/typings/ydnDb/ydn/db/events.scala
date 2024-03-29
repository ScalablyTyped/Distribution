package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  trait Event extends StObject {
    
    var name: String
    
    var `type`: EventType
  }
  object Event {
    
    inline def apply(name: String, `type`: EventType): Event = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordEvent
    extends StObject
       with Event {
    
    def getKey(): Any
    
    def getStoreName(): String
    
    def getValue(): Any
  }
  object RecordEvent {
    
    inline def apply(
      getKey: () => Any,
      getStoreName: () => String,
      getValue: () => Any,
      name: String,
      `type`: EventType
    ): RecordEvent = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction0(getKey), getStoreName = js.Any.fromFunction0(getStoreName), getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordEvent] (val x: Self) extends AnyVal {
      
      inline def setGetKey(value: () => Any): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
      
      inline def setGetStoreName(value: () => String): Self = StObject.set(x, "getStoreName", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
  
  trait StorageEvent
    extends StObject
       with Event {
    
    def getError(): js.Error
    
    def getOldVersion(): Double
    
    def getVersion(): Double
  }
  object StorageEvent {
    
    inline def apply(
      getError: () => js.Error,
      getOldVersion: () => Double,
      getVersion: () => Double,
      name: String,
      `type`: EventType
    ): StorageEvent = {
      val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getOldVersion = js.Any.fromFunction0(getOldVersion), getVersion = js.Any.fromFunction0(getVersion), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageEvent] (val x: Self) extends AnyVal {
      
      inline def setGetError(value: () => js.Error): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
      
      inline def setGetOldVersion(value: () => Double): Self = StObject.set(x, "getOldVersion", js.Any.fromFunction0(value))
      
      inline def setGetVersion(value: () => Double): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    }
  }
  
  trait StoreEvent
    extends StObject
       with Event {
    
    def getKeys(): js.Array[Any]
    
    def getStoreName(): String
    
    def getValues(): js.Array[Any]
  }
  object StoreEvent {
    
    inline def apply(
      getKeys: () => js.Array[Any],
      getStoreName: () => String,
      getValues: () => js.Array[Any],
      name: String,
      `type`: EventType
    ): StoreEvent = {
      val __obj = js.Dynamic.literal(getKeys = js.Any.fromFunction0(getKeys), getStoreName = js.Any.fromFunction0(getStoreName), getValues = js.Any.fromFunction0(getValues), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreEvent] (val x: Self) extends AnyVal {
      
      inline def setGetKeys(value: () => js.Array[Any]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
      
      inline def setGetStoreName(value: () => String): Self = StObject.set(x, "getStoreName", js.Any.fromFunction0(value))
      
      inline def setGetValues(value: () => js.Array[Any]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    }
  }
}
