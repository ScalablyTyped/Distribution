package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable2
import typings.three.mod.PropertyBinding
import typings.three.propertyBindingMod.ParseTrackNameResults
import typings.three.propertyBindingMod.PropertyBinding.Composite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPropertyBinding
  extends StObject
     with Instantiable2[/* rootNode */ Any, /* path */ String, PropertyBinding] {
  
  def create(root: Any, path: Any): typings.three.propertyBindingMod.PropertyBinding | Composite = js.native
  def create(root: Any, path: Any, parsedPath: Any): typings.three.propertyBindingMod.PropertyBinding | Composite = js.native
  
  def findNode(root: Any, nodeName: String): Any = js.native
  
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  
  def sanitizeNodeName(name: String): String = js.native
}
