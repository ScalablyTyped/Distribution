package typings.useColorScheme

import typings.useColorScheme.mod.Preference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useColorSchemeStrings {
  
  @js.native
  sealed trait dark
    extends StObject
       with Preference
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait light
    extends StObject
       with Preference
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait `no-preference`
    extends StObject
       with Preference
  inline def `no-preference`: `no-preference` = "no-preference".asInstanceOf[`no-preference`]
}
