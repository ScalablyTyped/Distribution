package typings.vanillaMasker

import typings.vanillaMasker.mod.MoneyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MaskAlphaNum extends StObject {
    
    def maskAlphaNum(): Unit = js.native
    
    def maskMoney(): Unit = js.native
    def maskMoney(options: MoneyOptions): Unit = js.native
    
    def maskNumber(): Unit = js.native
    
    def maskPattern(pattern: String): Unit = js.native
    
    def unMask(): Unit = js.native
  }
}
