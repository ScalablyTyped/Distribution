package typings.wordpressKeycodes

import typings.wordpressKeycodes.mod.WPKeycodeModifier
import typings.wordpressKeycodes.mod.WPModifierPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressKeycodesStrings {
  
  @js.native
  sealed trait access
    extends StObject
       with WPKeycodeModifier
  inline def access: access = "access".asInstanceOf[access]
  
  @js.native
  sealed trait alt
    extends StObject
       with WPKeycodeModifier
       with WPModifierPart
  inline def alt: alt = "alt".asInstanceOf[alt]
  
  @js.native
  sealed trait ctrl
    extends StObject
       with WPKeycodeModifier
       with WPModifierPart
  inline def ctrl: ctrl = "ctrl".asInstanceOf[ctrl]
  
  @js.native
  sealed trait ctrlShift
    extends StObject
       with WPKeycodeModifier
  inline def ctrlShift: ctrlShift = "ctrlShift".asInstanceOf[ctrlShift]
  
  @js.native
  sealed trait meta
    extends StObject
       with WPModifierPart
  inline def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait primary
    extends StObject
       with WPKeycodeModifier
  inline def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait primaryAlt
    extends StObject
       with WPKeycodeModifier
  inline def primaryAlt: primaryAlt = "primaryAlt".asInstanceOf[primaryAlt]
  
  @js.native
  sealed trait primaryShift
    extends StObject
       with WPKeycodeModifier
  inline def primaryShift: primaryShift = "primaryShift".asInstanceOf[primaryShift]
  
  @js.native
  sealed trait secondary
    extends StObject
       with WPKeycodeModifier
  inline def secondary: secondary = "secondary".asInstanceOf[secondary]
  
  @js.native
  sealed trait shift
    extends StObject
       with WPKeycodeModifier
       with WPModifierPart
  inline def shift: shift = "shift".asInstanceOf[shift]
  
  @js.native
  sealed trait shiftAlt
    extends StObject
       with WPKeycodeModifier
  inline def shiftAlt: shiftAlt = "shiftAlt".asInstanceOf[shiftAlt]
  
  @js.native
  sealed trait undefined
    extends StObject
       with WPKeycodeModifier
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
}
