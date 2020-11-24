package typings.synaptic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Trainer {
  
  type CostFunction = js.Function2[
    /* targetValues */ js.Array[scala.Double], 
    /* outputValues */ js.Array[scala.Double], 
    scala.Double
  ]
  
  type TrainingSet = js.Array[typings.synaptic.mod.Trainer.TrainingPair]
}
