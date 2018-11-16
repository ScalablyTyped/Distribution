package typings
package atUifabricMergeDashStylesLib.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InjectionMode extends js.Object

@JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode")
@js.native
object InjectionMode extends js.Object {
  /**
       * Appends rules using appendChild.
       */
  @js.native
  sealed trait appendChild
    extends atUifabricMergeDashStylesLib.libStylesheetMod.InjectionMode
  
  /**
       * Inserts rules using the insertRule api.
       */
  @js.native
  sealed trait insertNode
    extends atUifabricMergeDashStylesLib.libStylesheetMod.InjectionMode
  
  /**
       * Avoids style injection, use getRules() to read the styles.
       */
  @js.native
  sealed trait none
    extends atUifabricMergeDashStylesLib.libStylesheetMod.InjectionMode
  
  /* 2 */ val appendChild: appendChild with scala.Double = js.native
  /* 1 */ val insertNode: insertNode with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atUifabricMergeDashStylesLib.libStylesheetMod.InjectionMode with scala.Double] = js.native
}

