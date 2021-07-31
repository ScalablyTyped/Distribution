package typings.tslint

import typings.tslint.formatterMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterLoaderMod {
  
  @JSImport("tslint/lib/formatterLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findFormatter(name: String): js.UndefOr[FormatterConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatterConstructor]]
  @scala.inline
  def findFormatter(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FormatterConstructor]]
  @scala.inline
  def findFormatter(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatterConstructor]]
  @scala.inline
  def findFormatter(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FormatterConstructor]]
}
