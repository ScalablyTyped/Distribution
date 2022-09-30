package typings.upath2

import typings.upath2.anon.PickIPathsepname
import typings.upath2.coreMod.PathWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("upath2/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(destination: Any, input: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(destination.asInstanceOf[js.Any]).`++`(input.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def getStatic(who: Any): PathWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatic")(who.asInstanceOf[js.Any]).asInstanceOf[PathWrap]
  
  inline def replaceSep(who: PickIPathsepname, input: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_replace_sep")(who.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripSep(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_strip_sep")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
