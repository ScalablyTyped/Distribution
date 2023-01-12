package typings.verovio

import org.scalablytyped.runtime.StringDictionary
import typings.verovio.availableOptionsMod.AnyOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attribute extends StObject {
    
    var attribute: String
    
    var elementId: String
    
    var value: String
  }
  object Attribute {
    
    inline def apply(attribute: String, elementId: String, value: String): Attribute = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CtrlKey extends StObject {
    
    var ctrlKey: Boolean
    
    var elementId: String
    
    var key: Double
    
    var shiftKey: Boolean
  }
  object CtrlKey {
    
    inline def apply(ctrlKey: Boolean, elementId: String, key: Double, shiftKey: Boolean): CtrlKey = {
      val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CtrlKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CtrlKey] (val x: Self) extends AnyVal {
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementId extends StObject {
    
    var elementId: String
  }
  object ElementId {
    
    inline def apply(elementId: String): ElementId = {
      val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementId] (val x: Self) extends AnyVal {
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementType extends StObject {
    
    var elementType: String
    
    var endid: String
    
    var startid: String
  }
  object ElementType {
    
    inline def apply(elementType: String, endid: String, startid: String): ElementType = {
      val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], endid = endid.asInstanceOf[js.Any], startid = startid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementType] (val x: Self) extends AnyVal {
      
      inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setEndid(value: String): Self = StObject.set(x, "endid", value.asInstanceOf[js.Any])
      
      inline def setStartid(value: String): Self = StObject.set(x, "startid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var options: StringDictionary[AnyOption]
  }
  object Name {
    
    inline def apply(name: String, options: StringDictionary[AnyOption]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[AnyOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Notes extends StObject {
    
    var notes: js.Array[String]
    
    var page: Double
  }
  object Notes {
    
    inline def apply(notes: js.Array[String], page: Double): Notes = {
      val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Notes] (val x: Self) extends AnyVal {
      
      inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value*))
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait RealTimeOffsetMilliseconds extends StObject {
    
    var realTimeOffsetMilliseconds: Double
    
    var realTimeOnsetMilliseconds: Double
    
    var scoreTimeDuration: Double
    
    var scoreTimeOffset: Double
    
    var scoreTimeOnset: Double
    
    var scoreTimeTiedDuration: Double
  }
  object RealTimeOffsetMilliseconds {
    
    inline def apply(
      realTimeOffsetMilliseconds: Double,
      realTimeOnsetMilliseconds: Double,
      scoreTimeDuration: Double,
      scoreTimeOffset: Double,
      scoreTimeOnset: Double,
      scoreTimeTiedDuration: Double
    ): RealTimeOffsetMilliseconds = {
      val __obj = js.Dynamic.literal(realTimeOffsetMilliseconds = realTimeOffsetMilliseconds.asInstanceOf[js.Any], realTimeOnsetMilliseconds = realTimeOnsetMilliseconds.asInstanceOf[js.Any], scoreTimeDuration = scoreTimeDuration.asInstanceOf[js.Any], scoreTimeOffset = scoreTimeOffset.asInstanceOf[js.Any], scoreTimeOnset = scoreTimeOnset.asInstanceOf[js.Any], scoreTimeTiedDuration = scoreTimeTiedDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[RealTimeOffsetMilliseconds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RealTimeOffsetMilliseconds] (val x: Self) extends AnyVal {
      
      inline def setRealTimeOffsetMilliseconds(value: Double): Self = StObject.set(x, "realTimeOffsetMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setRealTimeOnsetMilliseconds(value: Double): Self = StObject.set(x, "realTimeOnsetMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setScoreTimeDuration(value: Double): Self = StObject.set(x, "scoreTimeDuration", value.asInstanceOf[js.Any])
      
      inline def setScoreTimeOffset(value: Double): Self = StObject.set(x, "scoreTimeOffset", value.asInstanceOf[js.Any])
      
      inline def setScoreTimeOnset(value: Double): Self = StObject.set(x, "scoreTimeOnset", value.asInstanceOf[js.Any])
      
      inline def setScoreTimeTiedDuration(value: Double): Self = StObject.set(x, "scoreTimeTiedDuration", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var elementId: String
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(elementId: String, x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
