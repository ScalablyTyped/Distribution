package typings.yCodemirror

import org.scalablytyped.runtime.Instantiable4
import typings.lib0.mutexMod.mutex
import typings.lib0.observableMod.Observable
import typings.std.Map
import typings.std.Set
import typings.yCodemirror.anon.Anchor
import typings.yCodemirror.anon.ChangedParentTypes
import typings.yCodemirror.anon.StackItem
import typings.yCodemirror.anon.YUndoManager
import typings.yCodemirror.yCodemirrorStrings.`y-codemirror`
import typings.yjs.mod.Doc
import typings.yjs.mod.Text
import typings.yjs.mod.UndoManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("y-codemirror", "CodeMirrorBinding")
  @js.native
  open class CodeMirrorBinding_ protected () extends CodemirrorBinding {
    /**
      * @param {Y.Text} textType
      * @param {import('codemirror').Editor} codeMirror
      * @param {any | null} [awareness]
      * @param {{ yUndoManager?: Y.UndoManager }} [options]
      */
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Any
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Any,
      hasYUndoManager: YUndoManager
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Null,
      hasYUndoManager: YUndoManager
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Unit,
      hasYUndoManager: YUndoManager
    ) = this()
  }
  
  @JSImport("y-codemirror", "CodeMirrorBinding")
  @js.native
  val CodeMirrorBinding_ : Instantiable4[
    /* textType */ Text, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ /* codeMirror */ Any, 
    /* awareness */ js.UndefOr[Any | Null], 
    /* hasYUndoManager */ js.UndefOr[YUndoManager], 
    CodemirrorBinding
  ] = js.native
  
  @JSImport("y-codemirror", "CodemirrorBinding")
  @js.native
  open class CodemirrorBinding protected () extends Observable[Any] {
    /**
      * @param {Y.Text} textType
      * @param {import('codemirror').Editor} codeMirror
      * @param {any | null} [awareness]
      * @param {{ yUndoManager?: Y.UndoManager }} [options]
      */
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Any
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Any,
      hasYUndoManager: YUndoManager
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Null,
      hasYUndoManager: YUndoManager
    ) = this()
    def this(
      textType: Text,
      codeMirror: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_codemirror.Editor */ Any,
      awareness: Unit,
      hasYUndoManager: YUndoManager
    ) = this()
    
    def _awarenessListener(event: Any): Unit = js.native
    
    def _beforeChange(): Unit = js.native
    
    /**
      * @type {{ anchor: Y.RelativePosition, head: Y.RelativePosition } | null}
      */
    var _beforeChangeSelection: Anchor = js.native
    
    def _blurListeer(): Any = js.native
    
    var _changedCursors: Set[Any] = js.native
    
    def _cursorListener(): Unit = js.native
    
    var _cursors: Map[Any, Any] = js.native
    
    def _debounceCursorEvent(arg0: js.Function0[Unit]): Unit = js.native
    
    def _mux(cb: js.Function0[Unit]): Any = js.native
    def _mux(cb: js.Function0[Unit], elseCb: js.Function0[Unit]): Any = js.native
    @JSName("_mux")
    var _mux_Original: mutex = js.native
    
    def _onStackItemAdded(hasStackItemChangedParentTypes: ChangedParentTypes): Unit = js.native
    
    def _onStackItemPopped(hasStackItem: StackItem): Unit = js.native
    
    var _pendingCursorEvent: Boolean = js.native
    
    def _targetObserver(instance: Any, changes: Any): Unit = js.native
    
    def _typeObserver(event: Any): Unit = js.native
    
    var awareness: Any = js.native
    
    var cm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ Any = js.native
    
    var cmDoc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Doc */ Any = js.native
    
    var doc: Doc = js.native
    
    var `type`: Text = js.native
    
    var yUndoManager: UndoManager = js.native
  }
  
  @JSImport("y-codemirror", "cmOrigin")
  @js.native
  val cmOrigin: `y-codemirror` = js.native
}
