package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkArrayLengths(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    targets: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
  def checkArrayLengths(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    targets: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
  def collectMetrics(
    metrics: atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn,
    outputNames: js.Array[java.lang.String]
  ): js.Array[
    js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]
  ] = js.native
  def collectMetrics(metrics: java.lang.String, outputNames: js.Array[java.lang.String]): js.Array[
    js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]
  ] = js.native
  def collectMetrics(
    metrics: js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn],
    outputNames: js.Array[java.lang.String]
  ): js.Array[
    js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]
  ] = js.native
  def collectMetrics(
    metrics: org.scalablytyped.runtime.StringDictionary[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn],
    outputNames: js.Array[java.lang.String]
  ): js.Array[
    js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]
  ] = js.native
  def isDataArray(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Boolean = js.native
  def isDataArray(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Boolean = js.native
  def isDataArray(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Boolean = js.native
  def isDataDict(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Boolean = js.native
  def isDataDict(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Boolean = js.native
  def isDataDict(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Boolean = js.native
  def isDataTensor(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Boolean = js.native
  def isDataTensor(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Boolean = js.native
  def isDataTensor(
    x: org.scalablytyped.runtime.StringDictionary[
      (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]) | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Boolean = js.native
  def standardizeInputData(
    data: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    names: js.Array[java.lang.String]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    checkBatchAxis: scala.Boolean
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    checkBatchAxis: scala.Boolean,
    exceptionPrefix: java.lang.String
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    checkBatchAxis: scala.Boolean
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    checkBatchAxis: scala.Boolean,
    exceptionPrefix: java.lang.String
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    checkBatchAxis: scala.Boolean
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeInputData(
    data: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    names: js.Array[java.lang.String],
    shapes: js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    checkBatchAxis: scala.Boolean,
    exceptionPrefix: java.lang.String
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
}

