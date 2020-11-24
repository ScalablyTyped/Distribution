package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object environmentMod {
  
  type FlagEvaluationFn = js.Function0[
    typings.tensorflowTfjsCore.environmentMod.FlagValue | js.Promise[typings.tensorflowTfjsCore.environmentMod.FlagValue]
  ]
  
  type FlagValue = scala.Double | scala.Boolean
  
  type Flags = org.scalablytyped.runtime.StringDictionary[typings.tensorflowTfjsCore.environmentMod.FlagValue]
}
