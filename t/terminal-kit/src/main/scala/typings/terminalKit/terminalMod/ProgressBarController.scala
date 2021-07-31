package typings.terminalKit.terminalMod

import typings.terminalKit.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarController extends StObject {
  
  def itemDone(name: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resume(): Unit = js.native
  
  def startItem(name: String): Unit = js.native
  
  def stop(): Unit = js.native
  
  def update(updateObject: Double): Unit = js.native
  def update(updateObject: Items): Unit = js.native
}
