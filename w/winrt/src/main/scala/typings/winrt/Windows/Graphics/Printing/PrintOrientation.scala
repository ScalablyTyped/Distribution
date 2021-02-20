package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrientation extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends StObject {
  
  @js.native
  sealed trait default extends PrintOrientation
  
  @js.native
  sealed trait landscape extends PrintOrientation
  
  @js.native
  sealed trait landscapeFlipped extends PrintOrientation
  
  @js.native
  sealed trait notAvailable extends PrintOrientation
  
  @js.native
  sealed trait portrait extends PrintOrientation
  
  @js.native
  sealed trait portraitFlipped extends PrintOrientation
  
  @js.native
  sealed trait printerCustom extends PrintOrientation
}
