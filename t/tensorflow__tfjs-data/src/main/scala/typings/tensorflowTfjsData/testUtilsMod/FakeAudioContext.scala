package typings.tensorflowTfjsData.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
@js.native
class FakeAudioContext () extends js.Object {
  
  def close(): Unit = js.native
  
  def createAnalyser(): FakeAnalyser = js.native
  
  def createMediaStreamSource(): FakeMediaStreamAudioSourceNode = js.native
  
  val sampleRate: /* 44100 */ Double = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
@js.native
object FakeAudioContext extends js.Object {
  
  def createInstance(): FakeAudioContext = js.native
}
