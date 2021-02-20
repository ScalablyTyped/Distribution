package typings.uidGenerator

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import typings.uidGenerator.uidGeneratorStrings.`0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ`
import typings.uidGenerator.uidGeneratorStrings.`0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-Dot_Tilde`
import typings.uidGenerator.uidGeneratorStrings.`0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzExclamationmarkApostropheLeftparenthesisRightparenthesisAsterisk-Dot_Tilde`
import typings.uidGenerator.uidGeneratorStrings.`0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`
import typings.uidGenerator.uidGeneratorStrings.`0123456789abcdef`
import typings.uidGenerator.uidGeneratorStrings.`123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz`
import typings.uidGenerator.uidGeneratorStrings.`ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisAsteriskPlussignComma-DotSlash0123456789ColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@ABCDEFGHIJKLMNOPQRSTUVWXYZ[Backslash]^_GraveaccentabcdefghijklmnopqrstuvwxyzLeftcurlybracketVerticallineRightcurlybracketTilde`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("uid-generator", JSImport.Namespace)
  @js.native
  class ^ () extends UIDGeneratorInstance {
    def this(baseEncoding: String) = this()
    def this(bitSize: Double) = this()
    def this(bitSize: js.UndefOr[scala.Nothing], baseEncoding: String) = this()
    def this(bitSize: Double, baseEncoding: String) = this()
  }
  @JSImport("uid-generator", JSImport.Namespace)
  @js.native
  val ^ : UIDGeneratorClass = js.native
  
  @js.native
  trait UIDGeneratorClass
    extends Instantiable0[UIDGeneratorInstance]
       with Instantiable1[(/* bitSize */ Double) | (/* baseEncoding */ String), UIDGeneratorInstance]
       with Instantiable2[js.UndefOr[/* bitSize */ Double], /* baseEncoding */ String, UIDGeneratorInstance] {
    
    val BASE16: `0123456789abcdef` = js.native
    
    val BASE36: `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ` = js.native
    
    val BASE58: `123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz` = js.native
    
    val BASE62: `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz` = js.native
    
    val BASE66: `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-Dot_Tilde` = js.native
    
    val BASE71: `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzExclamationmarkApostropheLeftparenthesisRightparenthesisAsterisk-Dot_Tilde` = js.native
    
    val BASE94: `ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisAsteriskPlussignComma-DotSlash0123456789ColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@ABCDEFGHIJKLMNOPQRSTUVWXYZ[Backslash]^_GraveaccentabcdefghijklmnopqrstuvwxyzLeftcurlybracketVerticallineRightcurlybracketTilde` = js.native
  }
  
  @js.native
  trait UIDGeneratorInstance extends StObject {
    
    val base: Double = js.native
    
    val baseEncoding: String = js.native
    
    val bitSize: Double = js.native
    
    def generate(): js.Promise[String] = js.native
    def generate(cb: js.Function2[/* error */ Error | Null, /* uid */ String, _]): Unit = js.native
    
    def generateSync(): String = js.native
    
    val uidLength: Double = js.native
  }
  
  type _To = UIDGeneratorClass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UIDGeneratorClass = ^
}
