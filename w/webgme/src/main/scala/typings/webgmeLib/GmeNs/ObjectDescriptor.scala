package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectDescriptor extends js.Object {
  var childrenIds: js.Array[java.lang.String]
  var childrenNum: scala.Double
  var control: js.UndefOr[VisualizerControl] = js.undefined
  var dstObjId: java.lang.String
  var dstPos: Pos2D
  var dstSubCompId: js.UndefOr[java.lang.String] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var isConnection: scala.Boolean
  var metaInfo: js.UndefOr[webgmeLib.GmeCommonNs.Dictionary[java.lang.String]] = js.undefined
  var name: java.lang.String
  var parentId: java.lang.String
  var pointers: webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeCommonNs.Pointer]
  var position: scala.Double
  var preferencesHelper: js.UndefOr[PreferenceHelper] = js.undefined
  var reconnectable: js.UndefOr[scala.Boolean] = js.undefined
  var source: java.lang.String
  var srcObjId: java.lang.String
  var srcPos: Pos2D
  var srcSubCompId: js.UndefOr[java.lang.String] = js.undefined
  var target: java.lang.String
}

