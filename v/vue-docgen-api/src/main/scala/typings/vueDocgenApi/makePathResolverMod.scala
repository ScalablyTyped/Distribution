package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makePathResolverMod {
  
  @JSImport("vue-docgen-api/dist/utils/makePathResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(refDirName: String): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refDirName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ]]
  @scala.inline
  def default(refDirName: String, aliases: StringDictionary[String]): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refDirName.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ]]
  @scala.inline
  def default(refDirName: String, aliases: StringDictionary[String], modules: js.Array[String]): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refDirName.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any], modules.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ]]
  @scala.inline
  def default(refDirName: String, aliases: Unit, modules: js.Array[String]): js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refDirName.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any], modules.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* filePath */ String, 
    /* originalDirNameOverride */ js.UndefOr[String], 
    String | Null
  ]]
}
