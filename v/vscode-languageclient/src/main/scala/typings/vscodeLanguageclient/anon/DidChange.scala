package typings.vscodeLanguageclient.anon

import typings.vscode.mod.NotebookCell
import typings.vscode.mod.NotebookDocument
import typings.vscodeLanguageclient.notebookMod.VNotebookDocumentChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChange extends StObject {
  
  var didChange: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* event */ VNotebookDocumentChangeEvent, 
      /* next */ js.ThisFunction1[/* this */ Unit, /* event */ VNotebookDocumentChangeEvent, js.Promise[Unit]], 
      js.Promise[Unit]
    ]
  ] = js.undefined
  
  var didClose: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* notebookDocument */ NotebookDocument, 
      /* cells */ js.Array[NotebookCell], 
      /* next */ js.ThisFunction2[
        /* this */ Unit, 
        /* notebookDocument */ NotebookDocument, 
        /* cells */ js.Array[NotebookCell], 
        js.Promise[Unit]
      ], 
      js.Promise[Unit]
    ]
  ] = js.undefined
  
  var didOpen: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* notebookDocument */ NotebookDocument, 
      /* cells */ js.Array[NotebookCell], 
      /* next */ js.ThisFunction2[
        /* this */ Unit, 
        /* notebookDocument */ NotebookDocument, 
        /* cells */ js.Array[NotebookCell], 
        js.Promise[Unit]
      ], 
      js.Promise[Unit]
    ]
  ] = js.undefined
  
  var didSave: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* notebookDocument */ NotebookDocument, 
      /* next */ js.ThisFunction1[/* this */ Unit, /* notebookDocument */ NotebookDocument, js.Promise[Unit]], 
      js.Promise[Unit]
    ]
  ] = js.undefined
}
object DidChange {
  
  inline def apply(): DidChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChange]
  }
  
  extension [Self <: DidChange](x: Self) {
    
    inline def setDidChange(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* event */ VNotebookDocumentChangeEvent, 
          /* next */ js.ThisFunction1[/* this */ Unit, /* event */ VNotebookDocumentChangeEvent, js.Promise[Unit]], 
          js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "didChange", value.asInstanceOf[js.Any])
    
    inline def setDidChangeUndefined: Self = StObject.set(x, "didChange", js.undefined)
    
    inline def setDidClose(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* notebookDocument */ NotebookDocument, 
          /* cells */ js.Array[NotebookCell], 
          /* next */ js.ThisFunction2[
            /* this */ Unit, 
            /* notebookDocument */ NotebookDocument, 
            /* cells */ js.Array[NotebookCell], 
            js.Promise[Unit]
          ], 
          js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "didClose", value.asInstanceOf[js.Any])
    
    inline def setDidCloseUndefined: Self = StObject.set(x, "didClose", js.undefined)
    
    inline def setDidOpen(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* notebookDocument */ NotebookDocument, 
          /* cells */ js.Array[NotebookCell], 
          /* next */ js.ThisFunction2[
            /* this */ Unit, 
            /* notebookDocument */ NotebookDocument, 
            /* cells */ js.Array[NotebookCell], 
            js.Promise[Unit]
          ], 
          js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "didOpen", value.asInstanceOf[js.Any])
    
    inline def setDidOpenUndefined: Self = StObject.set(x, "didOpen", js.undefined)
    
    inline def setDidSave(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* notebookDocument */ NotebookDocument, 
          /* next */ js.ThisFunction1[/* this */ Unit, /* notebookDocument */ NotebookDocument, js.Promise[Unit]], 
          js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "didSave", value.asInstanceOf[js.Any])
    
    inline def setDidSaveUndefined: Self = StObject.set(x, "didSave", js.undefined)
  }
}
