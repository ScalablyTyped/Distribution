package typings.yjs

import typings.lib0.observableMod.Observable
import typings.yjs.distSrcUtilsDocMod.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsAbstractConnectorMod {
  
  @JSImport("yjs/dist/src/utils/AbstractConnector", "AbstractConnector")
  @js.native
  open class AbstractConnector protected () extends Observable[Any] {
    /**
      * @param {Doc} ydoc
      * @param {any} awareness
      */
    def this(ydoc: Doc, awareness: Any) = this()
    
    var awareness: Any = js.native
    
    var doc: Doc = js.native
  }
}
