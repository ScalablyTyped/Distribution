package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Unicode")
@js.native
class Unicode ()
  extends typings.typescriptServices.TypeScript.Unicode
object Unicode {
  
  @JSImport("typescript-services", "Unicode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Unicode.isIdentifierPart")
  @js.native
  def isIdentifierPart(code: Double, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Unicode.isIdentifierStart")
  @js.native
  def isIdentifierStart(code: Double, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Unicode.lookupInUnicodeMap")
  @js.native
  def lookupInUnicodeMap(code: Double, map: js.Array[Double]): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Unicode.unicodeES3IdentifierPart")
  @js.native
  def unicodeES3IdentifierPart: js.Array[Double] = js.native
  @scala.inline
  def unicodeES3IdentifierPart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES3IdentifierPart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Unicode.unicodeES3IdentifierStart")
  @js.native
  def unicodeES3IdentifierStart: js.Array[Double] = js.native
  @scala.inline
  def unicodeES3IdentifierStart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES3IdentifierStart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Unicode.unicodeES5IdentifierPart")
  @js.native
  def unicodeES5IdentifierPart: js.Array[Double] = js.native
  @scala.inline
  def unicodeES5IdentifierPart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES5IdentifierPart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Unicode.unicodeES5IdentifierStart")
  @js.native
  def unicodeES5IdentifierStart: js.Array[Double] = js.native
  @scala.inline
  def unicodeES5IdentifierStart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES5IdentifierStart")(x.asInstanceOf[js.Any])
}
