package typings.word2vector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word2vector", "add")
  @js.native
  def add(p1: String, p2: String): js.Any = js.native
  @JSImport("word2vector", "add")
  @js.native
  def add(p1: String, p2: String, opt: js.Object): js.Any = js.native
  @JSImport("word2vector", "add")
  @js.native
  def add(p1: js.Array[Double], p2: js.Array[Double]): js.Any = js.native
  @JSImport("word2vector", "add")
  @js.native
  def add(p1: js.Array[Double], p2: js.Array[Double], opt: js.Object): js.Any = js.native
  
  @JSImport("word2vector", "bin2txt")
  @js.native
  def bin2txt(binFile: String): Boolean = js.native
  
  @JSImport("word2vector", "getNeighbors")
  @js.native
  def getNeighbors(vector: js.Array[Double]): js.Array[js.Object] = js.native
  @JSImport("word2vector", "getNeighbors")
  @js.native
  def getNeighbors(vector: js.Array[Double], opt: js.Object): js.Array[js.Object] = js.native
  
  @JSImport("word2vector", "getSimilarWords")
  @js.native
  def getSimilarWords(word: String): js.Array[js.Object] = js.native
  @JSImport("word2vector", "getSimilarWords")
  @js.native
  def getSimilarWords(word: String, options: js.Object): js.Array[js.Object] = js.native
  
  @JSImport("word2vector", "getVector")
  @js.native
  def getVector(word: String): js.Array[Double] = js.native
  
  @JSImport("word2vector", "getVectors")
  @js.native
  def getVectors(words: js.Array[String]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("word2vector", "load")
  @js.native
  def load(modelfile: String): Boolean = js.native
  @JSImport("word2vector", "load")
  @js.native
  def load(modelfile: String, filetype: String): Boolean = js.native
  
  @JSImport("word2vector", "similarity")
  @js.native
  def similarity(w1: String, w2: String): js.Any = js.native
  @JSImport("word2vector", "similarity")
  @js.native
  def similarity(w1: String, w2: String, options: js.Object): js.Any = js.native
  
  @JSImport("word2vector", "substract")
  @js.native
  def substract(p1: String, p2: String): js.Any = js.native
  @JSImport("word2vector", "substract")
  @js.native
  def substract(p1: String, p2: String, opt: js.Object): js.Any = js.native
  @JSImport("word2vector", "substract")
  @js.native
  def substract(p1: js.Array[Double], p2: js.Array[Double]): js.Any = js.native
  @JSImport("word2vector", "substract")
  @js.native
  def substract(p1: js.Array[Double], p2: js.Array[Double], opt: js.Object): js.Any = js.native
  
  @JSImport("word2vector", "train")
  @js.native
  def train(trainFile: String, modelFile: String): Unit = js.native
  @JSImport("word2vector", "train")
  @js.native
  def train(
    trainFile: String,
    modelFile: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  @JSImport("word2vector", "train")
  @js.native
  def train(trainFile: String, modelFile: String, options: js.Object): Unit = js.native
  @JSImport("word2vector", "train")
  @js.native
  def train(trainFile: String, modelFile: String, options: js.Object, callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("word2vector", "w2v")
  @js.native
  def w2v(): js.Any = js.native
}
