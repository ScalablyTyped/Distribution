package typings.verovio

import typings.verovio.anon.Attribute
import typings.verovio.anon.CtrlKey
import typings.verovio.anon.ElementId
import typings.verovio.anon.ElementType
import typings.verovio.anon.X
import typings.verovio.verovioStrings.chain
import typings.verovio.verovioStrings.commit
import typings.verovio.verovioStrings.delete
import typings.verovio.verovioStrings.drag
import typings.verovio.verovioStrings.insert
import typings.verovio.verovioStrings.keyDown
import typings.verovio.verovioStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorActionMod {
  
  trait ChainAction
    extends StObject
       with EditorAction {
    
    var action: chain
    
    var param: js.Array[EditorAction]
  }
  object ChainAction {
    
    inline def apply(param: js.Array[EditorAction]): ChainAction = {
      val __obj = js.Dynamic.literal(action = "chain", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChainAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChainAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: chain): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: js.Array[EditorAction]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamVarargs(value: EditorAction*): Self = StObject.set(x, "param", js.Array(value*))
    }
  }
  
  trait CommitAction
    extends StObject
       with EditorAction {
    
    var action: commit
  }
  object CommitAction {
    
    inline def apply(): CommitAction = {
      val __obj = js.Dynamic.literal(action = "commit")
      __obj.asInstanceOf[CommitAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommitAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: commit): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteAction
    extends StObject
       with EditorAction {
    
    var action: delete
    
    var param: ElementId
  }
  object DeleteAction {
    
    inline def apply(param: ElementId): DeleteAction = {
      val __obj = js.Dynamic.literal(action = "delete", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: ElementId): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragAction
    extends StObject
       with EditorAction {
    
    var action: drag
    
    var param: X
  }
  object DragAction {
    
    inline def apply(param: X): DragAction = {
      val __obj = js.Dynamic.literal(action = "drag", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: drag): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: X): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.verovio.editorActionMod.CommitAction
    - typings.verovio.editorActionMod.ChainAction
    - typings.verovio.editorActionMod.DeleteAction
    - typings.verovio.editorActionMod.DragAction
    - typings.verovio.editorActionMod.KeyDownAction
    - typings.verovio.editorActionMod.InsertAction
    - typings.verovio.editorActionMod.SetAction
  */
  trait EditorAction extends StObject
  object EditorAction {
    
    inline def ChainAction(param: js.Array[EditorAction]): typings.verovio.editorActionMod.ChainAction = {
      val __obj = js.Dynamic.literal(action = "chain", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.editorActionMod.ChainAction]
    }
    
    inline def CommitAction(): typings.verovio.editorActionMod.CommitAction = {
      val __obj = js.Dynamic.literal(action = "commit")
      __obj.asInstanceOf[typings.verovio.editorActionMod.CommitAction]
    }
    
    inline def DeleteAction(param: ElementId): typings.verovio.editorActionMod.DeleteAction = {
      val __obj = js.Dynamic.literal(action = "delete", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.editorActionMod.DeleteAction]
    }
    
    inline def DragAction(param: X): typings.verovio.editorActionMod.DragAction = {
      val __obj = js.Dynamic.literal(action = "drag", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.editorActionMod.DragAction]
    }
    
    inline def InsertAction(param: ElementType): typings.verovio.editorActionMod.InsertAction = {
      val __obj = js.Dynamic.literal(action = "insert", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.editorActionMod.InsertAction]
    }
    
    inline def KeyDownAction(param: CtrlKey): typings.verovio.editorActionMod.KeyDownAction = {
      val __obj = js.Dynamic.literal(action = "keyDown", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.editorActionMod.KeyDownAction]
    }
    
    inline def SetAction(param: Attribute): typings.verovio.editorActionMod.SetAction = {
      val __obj = js.Dynamic.literal(action = "set", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.editorActionMod.SetAction]
    }
  }
  
  trait InsertAction
    extends StObject
       with EditorAction {
    
    var action: insert
    
    var param: ElementType
  }
  object InsertAction {
    
    inline def apply(param: ElementType): InsertAction = {
      val __obj = js.Dynamic.literal(action = "insert", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InsertAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: insert): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: ElementType): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyDownAction
    extends StObject
       with EditorAction {
    
    var action: keyDown
    
    var param: CtrlKey
  }
  object KeyDownAction {
    
    inline def apply(param: CtrlKey): KeyDownAction = {
      val __obj = js.Dynamic.literal(action = "keyDown", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyDownAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: keyDown): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: CtrlKey): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetAction
    extends StObject
       with EditorAction {
    
    var action: set
    
    var param: Attribute
  }
  object SetAction {
    
    inline def apply(param: Attribute): SetAction = {
      val __obj = js.Dynamic.literal(action = "set", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: set): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: Attribute): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
}
