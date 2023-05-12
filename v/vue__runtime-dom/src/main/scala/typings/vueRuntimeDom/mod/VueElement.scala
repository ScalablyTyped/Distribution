package typings.vueRuntimeDom.mod

import typings.std.Record
import typings.vueRuntimeCore.mod.RootHydrateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/runtime-dom", "VueElement")
@js.native
open class VueElement protected () extends StObject {
  def this(_def: InnerComponentDef) = this()
  def this(_def: InnerComponentDef, _props: Record[String, Any]) = this()
  def this(_def: InnerComponentDef, _props: Unit, hydrate: RootHydrateFunction) = this()
  def this(_def: InnerComponentDef, _props: Record[String, Any], hydrate: RootHydrateFunction) = this()
  
  /* private */ var _applyStyles: Any = js.native
  
  /* removed internal: _instance */
  /* private */ var _connected: Any = js.native
  
  /* private */ var _createVNode: Any = js.native
  
  /* private */ var _def: Any = js.native
  
  /* private */ var _numberProps: Any = js.native
  
  /* private */ var _props: Any = js.native
  
  /**
    * resolve inner component definition (handle possible async component)
    */
  /* private */ var _resolveDef: Any = js.native
  
  /* private */ var _resolveProps: Any = js.native
  
  /* private */ var _resolved: Any = js.native
  
  /* protected */ def _setAttr(key: String): Unit = js.native
  
  /* private */ var _styles: Any = js.native
  
  /* removed internal: _getProp */
  /* removed internal: _setProp */
  /* private */ var _update: Any = js.native
  
  def connectedCallback(): Unit = js.native
  
  def disconnectedCallback(): Unit = js.native
}
