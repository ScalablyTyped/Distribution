package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/utils/makePathResolver", JSImport.Namespace)
@js.native
object makePathResolverMod extends js.Object {
  
  def default(refDirName: String): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = js.native
  def default(refDirName: String, aliases: js.UndefOr[scala.Nothing], modules: js.Array[String]): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = js.native
  def default(refDirName: String, aliases: StringDictionary[String]): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = js.native
  def default(refDirName: String, aliases: StringDictionary[String], modules: js.Array[String]): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = js.native
}
