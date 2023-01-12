package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureBase extends StObject {
  
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: ServerCapabilities[LSPAny]): Unit
  
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: ClientCapabilities): Unit
}
object FeatureBase {
  
  inline def apply(fillServerCapabilities: ServerCapabilities[LSPAny] => Unit, initialize: ClientCapabilities => Unit): FeatureBase = {
    val __obj = js.Dynamic.literal(fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[FeatureBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureBase] (val x: Self) extends AnyVal {
    
    inline def setFillServerCapabilities(value: ServerCapabilities[LSPAny] => Unit): Self = StObject.set(x, "fillServerCapabilities", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: ClientCapabilities => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
  }
}
