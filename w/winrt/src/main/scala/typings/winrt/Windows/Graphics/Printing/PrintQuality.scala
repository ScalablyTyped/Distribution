package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintQuality extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends js.Object {
  @js.native
  sealed trait automatic extends PrintQuality
  
  @js.native
  sealed trait default extends PrintQuality
  
  @js.native
  sealed trait draft extends PrintQuality
  
  @js.native
  sealed trait fax extends PrintQuality
  
  @js.native
  sealed trait high extends PrintQuality
  
  @js.native
  sealed trait normal extends PrintQuality
  
  @js.native
  sealed trait notAvailable extends PrintQuality
  
  @js.native
  sealed trait photographic extends PrintQuality
  
  @js.native
  sealed trait printerCustom extends PrintQuality
  
  @js.native
  sealed trait text extends PrintQuality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintQuality with Double] = js.native
  /* 3 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 4 */ @js.native
  object draft extends TopLevel[draft with Double]
  
  /* 5 */ @js.native
  object fax extends TopLevel[fax with Double]
  
  /* 6 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 7 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 8 */ @js.native
  object photographic extends TopLevel[photographic with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 9 */ @js.native
  object text extends TopLevel[text with Double]
  
}

