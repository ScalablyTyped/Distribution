package typings.tinymce.mod

import typings.std.Node
import typings.tinymce.tinymceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  @js.native
  trait ChangeEvent extends Event
  object ChangeEvent {
    
    @scala.inline
    def apply(
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): ChangeEvent = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
  }
  
  @js.native
  trait CommandEvent extends Event {
    
    var command: String = js.native
    
    var ui: Boolean = js.native
    
    var value: String = js.native
  }
  object CommandEvent {
    
    @scala.inline
    def apply(
      command: String,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String,
      ui: Boolean,
      value: String
    ): CommandEvent = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandEvent]
    }
    
    @scala.inline
    implicit class CommandEventMutableBuilder[Self <: CommandEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUi(value: Boolean): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContentEvent extends Event {
    
    var content: String = js.native
    
    var format: String = js.native
    
    var set: Boolean = js.native
  }
  object ContentEvent {
    
    @scala.inline
    def apply(
      content: String,
      format: String,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      set: Boolean,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): ContentEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), set = set.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentEvent]
    }
    
    @scala.inline
    implicit class ContentEventMutableBuilder[Self <: ContentEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    def isDefaultPrevented(): Boolean = js.native
    
    def isImmediatePropagationStopped(): Boolean = js.native
    
    def isPropagationStopped(): Boolean = js.native
    
    def preventDefault(): Unit = js.native
    
    def stopImmediatePropagation(): Unit = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: String = js.native
    
    var `type`: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImmediatePropagationStopped(value: () => Boolean): Self = StObject.set(x, "isImmediatePropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FocusBlurEvent extends Event {
    
    var blurredEditor: Editor = js.native
  }
  object FocusBlurEvent {
    
    @scala.inline
    def apply(
      blurredEditor: Editor,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): FocusBlurEvent = {
      val __obj = js.Dynamic.literal(blurredEditor = blurredEditor.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusBlurEvent]
    }
    
    @scala.inline
    implicit class FocusBlurEventMutableBuilder[Self <: FocusBlurEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurredEditor(value: Editor): Self = StObject.set(x, "blurredEditor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeChangeEvent extends Event {
    
    var element: Node = js.native
    
    var parents: js.Array[Node] = js.native
    
    var selectionChange: Boolean = js.native
  }
  object NodeChangeEvent {
    
    @scala.inline
    def apply(
      element: Node,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      parents: js.Array[Node],
      preventDefault: () => Unit,
      selectionChange: Boolean,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): NodeChangeEvent = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), parents = parents.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selectionChange = selectionChange.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeChangeEvent]
    }
    
    @scala.inline
    implicit class NodeChangeEventMutableBuilder[Self <: NodeChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[Node]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: Node*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      @scala.inline
      def setSelectionChange(value: Boolean): Self = StObject.set(x, "selectionChange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessEvent extends Event {
    
    var content: String = js.native
    
    var forced_root_block: String = js.native
    
    var format: String = js.native
    
    var get: Boolean = js.native
    
    var get_inner: Boolean = js.native
    
    var node: Node = js.native
    
    var selection: `true` = js.native
  }
  object ProcessEvent {
    
    @scala.inline
    def apply(
      content: String,
      forced_root_block: String,
      format: String,
      get: Boolean,
      get_inner: Boolean,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      node: Node,
      preventDefault: () => Unit,
      selection: `true`,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): ProcessEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], forced_root_block = forced_root_block.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], get_inner = get_inner.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), node = node.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selection = selection.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessEvent]
    }
    
    @scala.inline
    implicit class ProcessEventMutableBuilder[Self <: ProcessEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForced_root_block(value: String): Self = StObject.set(x, "forced_root_block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet_inner(value: Boolean): Self = StObject.set(x, "get_inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: `true`): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UndoRedoEvent extends Event
  object UndoRedoEvent {
    
    @scala.inline
    def apply(
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: String,
      `type`: String
    ): UndoRedoEvent = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UndoRedoEvent]
    }
  }
}
