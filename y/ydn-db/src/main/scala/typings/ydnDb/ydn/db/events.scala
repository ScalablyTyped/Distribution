package typings.ydnDb.ydn.db

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @js.native
  trait Event extends StObject {
    
    var name: String = js.native
    
    var `type`: EventType = js.native
  }
  object Event {
    
    @scala.inline
    def apply(name: String, `type`: EventType): Event = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecordEvent extends Event {
    
    def getKey(): js.Any = js.native
    
    def getStoreName(): String = js.native
    
    def getValue(): js.Any = js.native
  }
  object RecordEvent {
    
    @scala.inline
    def apply(
      getKey: () => js.Any,
      getStoreName: () => String,
      getValue: () => js.Any,
      name: String,
      `type`: EventType
    ): RecordEvent = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction0(getKey), getStoreName = js.Any.fromFunction0(getStoreName), getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEvent]
    }
    
    @scala.inline
    implicit class RecordEventMutableBuilder[Self <: RecordEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetKey(value: () => js.Any): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStoreName(value: () => String): Self = StObject.set(x, "getStoreName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait StorageEvent extends Event {
    
    def getError(): Error = js.native
    
    def getOldVersion(): Double = js.native
    
    def getVersion(): Double = js.native
  }
  object StorageEvent {
    
    @scala.inline
    def apply(
      getError: () => Error,
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
    implicit class StorageEventMutableBuilder[Self <: StorageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetError(value: () => Error): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOldVersion(value: () => Double): Self = StObject.set(x, "getOldVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVersion(value: () => Double): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait StoreEvent extends Event {
    
    def getKeys(): js.Array[_] = js.native
    
    def getStoreName(): String = js.native
    
    def getValues(): js.Array[_] = js.native
  }
  object StoreEvent {
    
    @scala.inline
    def apply(
      getKeys: () => js.Array[_],
      getStoreName: () => String,
      getValues: () => js.Array[_],
      name: String,
      `type`: EventType
    ): StoreEvent = {
      val __obj = js.Dynamic.literal(getKeys = js.Any.fromFunction0(getKeys), getStoreName = js.Any.fromFunction0(getStoreName), getValues = js.Any.fromFunction0(getValues), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreEvent]
    }
    
    @scala.inline
    implicit class StoreEventMutableBuilder[Self <: StoreEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetKeys(value: () => js.Array[_]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStoreName(value: () => String): Self = StObject.set(x, "getStoreName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValues(value: () => js.Array[_]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    }
  }
}
