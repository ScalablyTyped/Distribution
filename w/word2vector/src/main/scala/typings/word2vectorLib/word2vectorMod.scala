package typings
package word2vectorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("word2vector", JSImport.Namespace)
@js.native
object word2vectorMod extends js.Object {
  def add(p1: java.lang.String, p2: java.lang.String): js.Any = js.native
  def add(p1: java.lang.String, p2: java.lang.String, opt: js.Object): js.Any = js.native
  def add(p1: js.Array[scala.Double], p2: js.Array[scala.Double]): js.Any = js.native
  def add(p1: js.Array[scala.Double], p2: js.Array[scala.Double], opt: js.Object): js.Any = js.native
  def bin2txt(binFile: java.lang.String): scala.Boolean = js.native
  def getNeighbors(vector: js.Array[scala.Double]): js.Array[js.Object] = js.native
  def getNeighbors(vector: js.Array[scala.Double], opt: js.Object): js.Array[js.Object] = js.native
  def getSimilarWords(word: java.lang.String): js.Array[js.Object] = js.native
  def getSimilarWords(word: java.lang.String, options: js.Object): js.Array[js.Object] = js.native
  def getVector(word: java.lang.String): js.Array[scala.Double] = js.native
  def getVectors(words: js.Array[java.lang.String]): js.Array[js.Array[scala.Double]] = js.native
  def load(modelfile: java.lang.String): scala.Boolean = js.native
  def load(modelfile: java.lang.String, filetype: java.lang.String): scala.Boolean = js.native
  def similarity(w1: java.lang.String, w2: java.lang.String): js.Any = js.native
  def similarity(w1: java.lang.String, w2: java.lang.String, options: js.Object): js.Any = js.native
  def substract(p1: java.lang.String, p2: java.lang.String): js.Any = js.native
  def substract(p1: java.lang.String, p2: java.lang.String, opt: js.Object): js.Any = js.native
  def substract(p1: js.Array[scala.Double], p2: js.Array[scala.Double]): js.Any = js.native
  def substract(p1: js.Array[scala.Double], p2: js.Array[scala.Double], opt: js.Object): js.Any = js.native
  def train(trainFile: java.lang.String, modelFile: java.lang.String): scala.Unit = js.native
  def train(trainFile: java.lang.String, modelFile: java.lang.String, options: js.Object): scala.Unit = js.native
  def train(
    trainFile: java.lang.String,
    modelFile: java.lang.String,
    options: js.Object,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def w2v(): js.Any = js.native
}

