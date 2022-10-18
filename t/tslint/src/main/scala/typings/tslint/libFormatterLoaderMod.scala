package typings.tslint

import typings.tslint.libLanguageFormatterFormatterMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterLoaderMod {
  
  @JSImport("tslint/lib/formatterLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findFormatter(name: String): js.UndefOr[FormatterConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatterConstructor]]
  inline def findFormatter(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FormatterConstructor]]
  inline def findFormatter(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatterConstructor]]
  inline def findFormatter(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FormatterConstructor]]
}
