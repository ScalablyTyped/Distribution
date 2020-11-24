package typings.word2vector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word2vector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def add(p1: String, p2: String): js.Any = js.native
  def add(p1: String, p2: String, opt: js.Object): js.Any = js.native
  def add(p1: js.Array[Double], p2: js.Array[Double]): js.Any = js.native
  def add(p1: js.Array[Double], p2: js.Array[Double], opt: js.Object): js.Any = js.native
  
  def bin2txt(binFile: String): Boolean = js.native
  
  def getNeighbors(vector: js.Array[Double]): js.Array[js.Object] = js.native
  def getNeighbors(vector: js.Array[Double], opt: js.Object): js.Array[js.Object] = js.native
  
  def getSimilarWords(word: String): js.Array[js.Object] = js.native
  def getSimilarWords(word: String, options: js.Object): js.Array[js.Object] = js.native
  
  def getVector(word: String): js.Array[Double] = js.native
  
  def getVectors(words: js.Array[String]): js.Array[js.Array[Double]] = js.native
  
  def load(modelfile: String): Boolean = js.native
  def load(modelfile: String, filetype: String): Boolean = js.native
  
  def similarity(w1: String, w2: String): js.Any = js.native
  def similarity(w1: String, w2: String, options: js.Object): js.Any = js.native
  
  def substract(p1: String, p2: String): js.Any = js.native
  def substract(p1: String, p2: String, opt: js.Object): js.Any = js.native
  def substract(p1: js.Array[Double], p2: js.Array[Double]): js.Any = js.native
  def substract(p1: js.Array[Double], p2: js.Array[Double], opt: js.Object): js.Any = js.native
  
  def train(trainFile: String, modelFile: String): Unit = js.native
  def train(
    trainFile: String,
    modelFile: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def train(trainFile: String, modelFile: String, options: js.Object): Unit = js.native
  def train(trainFile: String, modelFile: String, options: js.Object, callback: js.Function0[Unit]): Unit = js.native
  
  def w2v(): js.Any = js.native
}
