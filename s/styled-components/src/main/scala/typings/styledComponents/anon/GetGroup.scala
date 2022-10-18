package typings.styledComponents.anon

import typings.styledComponents.nativeDistSheetTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroup extends StObject {
  
  def clearGroup(group: Double): Unit = js.native
  
  def getGroup(group: Double): String = js.native
  
  var groupSizes: js.typedarray.Uint32Array = js.native
  
  def indexOfGroup(group: Double): Double = js.native
  
  def insertRules(group: Double, rules: String): Unit = js.native
  def insertRules(group: Double, rules: js.Array[String]): Unit = js.native
  
  var length: Double = js.native
  
  var tag: Tag = js.native
}
