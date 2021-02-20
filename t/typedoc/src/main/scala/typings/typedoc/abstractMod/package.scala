package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object abstractMod {
  
  type TraverseCallback = js.Function2[
    /* reflection */ typings.typedoc.abstractMod.Reflection, 
    /* property */ typings.typedoc.abstractMod.TraverseProperty, 
    scala.Boolean | scala.Unit
  ]
  
  @scala.inline
  def resetReflectionID(): scala.Unit = typings.typedoc.abstractMod.^.asInstanceOf[js.Dynamic].applyDynamic("resetReflectionID")().asInstanceOf[scala.Unit]
}
