package typings.three.nodesMod

import typings.three.threeStrings.`object`
import typings.three.threeStrings.frame
import typings.three.threeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeUpdateType {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeUpdateType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeUpdateType.Frame")
  @js.native
  def Frame: frame = js.native
  inline def Frame_=(x: frame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Frame")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeUpdateType.None")
  @js.native
  def None: none = js.native
  inline def None_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeUpdateType.Object")
  @js.native
  def Object: `object` = js.native
  inline def Object_=(x: `object`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
}
