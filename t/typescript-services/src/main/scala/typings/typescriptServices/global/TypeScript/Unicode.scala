package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Unicode")
@js.native
open class Unicode ()
  extends StObject
     with typings.typescriptServices.TypeScript.Unicode
object Unicode {
  
  @JSGlobal("TypeScript.Unicode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isIdentifierPart(code: Double, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierPart")(code.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def isIdentifierStart(code: Double, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def lookupInUnicodeMap(code: Double, map: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupInUnicodeMap")(code.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @JSGlobal("TypeScript.Unicode.unicodeES3IdentifierPart")
  @js.native
  def unicodeES3IdentifierPart: js.Array[Double] = js.native
  inline def unicodeES3IdentifierPart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES3IdentifierPart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.Unicode.unicodeES3IdentifierStart")
  @js.native
  def unicodeES3IdentifierStart: js.Array[Double] = js.native
  inline def unicodeES3IdentifierStart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES3IdentifierStart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.Unicode.unicodeES5IdentifierPart")
  @js.native
  def unicodeES5IdentifierPart: js.Array[Double] = js.native
  inline def unicodeES5IdentifierPart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES5IdentifierPart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.Unicode.unicodeES5IdentifierStart")
  @js.native
  def unicodeES5IdentifierStart: js.Array[Double] = js.native
  inline def unicodeES5IdentifierStart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeES5IdentifierStart")(x.asInstanceOf[js.Any])
}
