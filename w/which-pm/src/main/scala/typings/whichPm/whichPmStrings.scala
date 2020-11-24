package typings.whichPm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whichPmStrings {
  
  @scala.inline
  def npm: npm = "npm".asInstanceOf[npm]
  
  @scala.inline
  def pnpm: pnpm = "pnpm".asInstanceOf[pnpm]
  
  @scala.inline
  def yarn: yarn = "yarn".asInstanceOf[yarn]
  
  @js.native
  sealed trait npm extends js.Object
  
  @js.native
  sealed trait pnpm extends js.Object
  
  @js.native
  sealed trait yarn extends js.Object
}
