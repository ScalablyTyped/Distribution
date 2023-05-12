package typings.wikibaseSdk

import org.scalablytyped.runtime.Shortcut
import typings.wikibaseSdk.distSrcWikibaseSdkMod.Wbk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWellknownWikidataDotorgMod extends Shortcut {
  
  @JSImport("wikibase-sdk/dist/src/wellknown/wikidata.org", JSImport.Default)
  @js.native
  val default: Wbk = js.native
  
  @JSImport("wikibase-sdk/dist/src/wellknown/wikidata.org", "wdk")
  @js.native
  val wdk: Wbk = js.native
  
  type _To = Wbk
  
  /* This means you don't have to write `default`, but can instead just say `distSrcWellknownWikidataDotorgMod.foo` */
  override def _to: Wbk = default
}
