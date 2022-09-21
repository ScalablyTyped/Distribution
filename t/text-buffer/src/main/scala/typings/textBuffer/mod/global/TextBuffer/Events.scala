package typings.textBuffer.mod.global.TextBuffer

import typings.textBuffer.mod.global.TextBuffer.Structures.TextChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  The event objects that are passed into the callbacks which the user provides to
  *  specific API calls.
  */
object Events {
  
  trait BufferChanged extends StObject {
    
    /** Range of the new text. */
    var newRange: Range
    
    /** String containing the text that was inserted. */
    var newText: String
    
    /** Range of the old text. */
    var oldRange: Range
    
    /** String containing the text that was replaced. */
    var oldText: String
  }
  object BufferChanged {
    
    inline def apply(newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChanged = {
      val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferChanged]
    }
    
    extension [Self <: BufferChanged](x: Self) {
      
      inline def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
      
      inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferChanging extends StObject {
    
    /** Range of the old text. */
    var oldRange: Range
  }
  object BufferChanging {
    
    inline def apply(oldRange: Range): BufferChanging = {
      val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferChanging]
    }
    
    extension [Self <: BufferChanging](x: Self) {
      
      inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferStoppedChanging extends StObject {
    
    var changes: js.Array[TextChange]
  }
  object BufferStoppedChanging {
    
    inline def apply(changes: js.Array[TextChange]): BufferStoppedChanging = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferStoppedChanging]
    }
    
    extension [Self <: BufferStoppedChanging](x: Self) {
      
      inline def setChanges(value: js.Array[TextChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: TextChange*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait BufferWatchError extends StObject {
    
    /** The error object. */
    var error: js.Error
    
    /**
      *  Call this function to indicate you have handled the error.
      *  The error will not be thrown if this function is called.
      */
    def handle(): Unit
  }
  object BufferWatchError {
    
    inline def apply(error: js.Error, handle: () => Unit): BufferWatchError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
      __obj.asInstanceOf[BufferWatchError]
    }
    
    extension [Self <: BufferWatchError](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: () => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction0(value))
    }
  }
  
  trait DisplayMarkerChanged extends StObject {
    
    /** Boolean indicating whether the marker had a tail before the change. */
    var hadTail: Boolean
    
    /** Boolean indicating whether the marker now has a tail */
    var hasTail: Boolean
    
    /** Boolean indicating whether the marker is now valid. */
    var isValid: Boolean
    
    /** Point representing the new head buffer position. */
    var newHeadBufferPosition: Point
    
    /** Point representing the new head screen position. */
    var newHeadScreenPosition: Point
    
    /**
      *  Object containing the marker's custom properties after the change.
      *  @deprecated
      */
    var newProperties: js.Object
    
    /** Point representing the new tail buffer position. */
    var newTailBufferPosition: Point
    
    /** Point representing the new tail screen position. */
    var newTailScreenPosition: Point
    
    /** Point representing the former head buffer position. */
    var oldHeadBufferPosition: Point
    
    /** Point representing the former head screen position. */
    var oldHeadScreenPosition: Point
    
    /**
      *  Object containing the marker's custom properties before the change.
      *  @deprecated
      */
    var oldProperties: js.Object
    
    // Point representing the former tail buffer position. */
    var oldTailBufferPosition: Point
    
    /** Point representing the former tail screen position. */
    var oldTailScreenPosition: Point
    
    /**
      *  Boolean indicating whether this change was caused by a textual change to the
      *  buffer or whether the marker was manipulated directly via its public API.
      */
    var textChanged: Boolean
    
    /** Boolean indicating whether the marker was valid before the change. */
    var wasValid: Boolean
  }
  object DisplayMarkerChanged {
    
    inline def apply(
      hadTail: Boolean,
      hasTail: Boolean,
      isValid: Boolean,
      newHeadBufferPosition: Point,
      newHeadScreenPosition: Point,
      newProperties: js.Object,
      newTailBufferPosition: Point,
      newTailScreenPosition: Point,
      oldHeadBufferPosition: Point,
      oldHeadScreenPosition: Point,
      oldProperties: js.Object,
      oldTailBufferPosition: Point,
      oldTailScreenPosition: Point,
      textChanged: Boolean,
      wasValid: Boolean
    ): DisplayMarkerChanged = {
      val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadBufferPosition = newHeadBufferPosition.asInstanceOf[js.Any], newHeadScreenPosition = newHeadScreenPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailBufferPosition = newTailBufferPosition.asInstanceOf[js.Any], newTailScreenPosition = newTailScreenPosition.asInstanceOf[js.Any], oldHeadBufferPosition = oldHeadBufferPosition.asInstanceOf[js.Any], oldHeadScreenPosition = oldHeadScreenPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailBufferPosition = oldTailBufferPosition.asInstanceOf[js.Any], oldTailScreenPosition = oldTailScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayMarkerChanged]
    }
    
    extension [Self <: DisplayMarkerChanged](x: Self) {
      
      inline def setHadTail(value: Boolean): Self = StObject.set(x, "hadTail", value.asInstanceOf[js.Any])
      
      inline def setHasTail(value: Boolean): Self = StObject.set(x, "hasTail", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setNewHeadBufferPosition(value: Point): Self = StObject.set(x, "newHeadBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setNewHeadScreenPosition(value: Point): Self = StObject.set(x, "newHeadScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setNewProperties(value: js.Object): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setNewTailBufferPosition(value: Point): Self = StObject.set(x, "newTailBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setNewTailScreenPosition(value: Point): Self = StObject.set(x, "newTailScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setOldHeadBufferPosition(value: Point): Self = StObject.set(x, "oldHeadBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setOldHeadScreenPosition(value: Point): Self = StObject.set(x, "oldHeadScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setOldProperties(value: js.Object): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
      
      inline def setOldTailBufferPosition(value: Point): Self = StObject.set(x, "oldTailBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setOldTailScreenPosition(value: Point): Self = StObject.set(x, "oldTailScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
      
      inline def setWasValid(value: Boolean): Self = StObject.set(x, "wasValid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileSaved extends StObject {
    
    /** The path to which the buffer was saved. */
    var path: String
  }
  object FileSaved {
    
    inline def apply(path: String): FileSaved = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSaved]
    }
    
    extension [Self <: FileSaved](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerChanged extends StObject {
    
    /** Boolean indicating whether the marker had a tail before the change. */
    var hadTail: Boolean
    
    /** Boolean indicating whether the marker now has a tail. */
    var hasTail: Boolean
    
    /** Boolean indicating whether the marker is now valid. */
    var isValid: Boolean
    
    /** Point representing the new head position. */
    var newHeadPosition: Point
    
    /**
      *  Object containing the marker's custom properties after the change.
      *  @deprecated
      */
    var newProperties: js.Object
    
    /** Point representing the new tail position. */
    var newTailPosition: Point
    
    /** Point representing the former head position. */
    var oldHeadPosition: Point
    
    /**
      *  Object containing the marker's custom properties before the change.
      *  @deprecated
      */
    var oldProperties: js.Object
    
    /** Point representing the former tail position. */
    var oldTailPosition: Point
    
    /**
      *  Boolean indicating whether this change was caused by a textual
      *  change to the buffer or whether the marker was manipulated directly
      *  via its public API.
      */
    var textChanged: Boolean
    
    /** Boolean indicating whether the marker was valid before the change. */
    var wasValid: Boolean
  }
  object MarkerChanged {
    
    inline def apply(
      hadTail: Boolean,
      hasTail: Boolean,
      isValid: Boolean,
      newHeadPosition: Point,
      newProperties: js.Object,
      newTailPosition: Point,
      oldHeadPosition: Point,
      oldProperties: js.Object,
      oldTailPosition: Point,
      textChanged: Boolean,
      wasValid: Boolean
    ): MarkerChanged = {
      val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadPosition = newHeadPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailPosition = newTailPosition.asInstanceOf[js.Any], oldHeadPosition = oldHeadPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailPosition = oldTailPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerChanged]
    }
    
    extension [Self <: MarkerChanged](x: Self) {
      
      inline def setHadTail(value: Boolean): Self = StObject.set(x, "hadTail", value.asInstanceOf[js.Any])
      
      inline def setHasTail(value: Boolean): Self = StObject.set(x, "hasTail", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setNewHeadPosition(value: Point): Self = StObject.set(x, "newHeadPosition", value.asInstanceOf[js.Any])
      
      inline def setNewProperties(value: js.Object): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setNewTailPosition(value: Point): Self = StObject.set(x, "newTailPosition", value.asInstanceOf[js.Any])
      
      inline def setOldHeadPosition(value: Point): Self = StObject.set(x, "oldHeadPosition", value.asInstanceOf[js.Any])
      
      inline def setOldProperties(value: js.Object): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
      
      inline def setOldTailPosition(value: Point): Self = StObject.set(x, "oldTailPosition", value.asInstanceOf[js.Any])
      
      inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
      
      inline def setWasValid(value: Boolean): Self = StObject.set(x, "wasValid", value.asInstanceOf[js.Any])
    }
  }
}
