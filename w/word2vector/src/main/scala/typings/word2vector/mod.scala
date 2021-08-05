package typings.word2vector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word2vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(p1: String, p2: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def add(p1: String, p2: String, opt: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def add(p1: js.Array[Double], p2: js.Array[Double]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def add(p1: js.Array[Double], p2: js.Array[Double], opt: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def bin2txt(binFile: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bin2txt")(binFile.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getNeighbors(vector: js.Array[Double]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNeighbors")(vector.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def getNeighbors(vector: js.Array[Double], opt: js.Object): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNeighbors")(vector.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  inline def getSimilarWords(word: String): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSimilarWords")(word.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def getSimilarWords(word: String, options: js.Object): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSimilarWords")(word.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  inline def getVector(word: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVector")(word.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getVectors(words: js.Array[String]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVectors")(words.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def load(modelfile: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(modelfile.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def load(modelfile: String, filetype: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(modelfile.asInstanceOf[js.Any], filetype.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def similarity(w1: String, w2: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("similarity")(w1.asInstanceOf[js.Any], w2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def similarity(w1: String, w2: String, options: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("similarity")(w1.asInstanceOf[js.Any], w2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def substract(p1: String, p2: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("substract")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def substract(p1: String, p2: String, opt: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("substract")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def substract(p1: js.Array[Double], p2: js.Array[Double]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("substract")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def substract(p1: js.Array[Double], p2: js.Array[Double], opt: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("substract")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def train(trainFile: String, modelFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("train")(trainFile.asInstanceOf[js.Any], modelFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def train(trainFile: String, modelFile: String, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("train")(trainFile.asInstanceOf[js.Any], modelFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def train(trainFile: String, modelFile: String, options: js.Object, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("train")(trainFile.asInstanceOf[js.Any], modelFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def train(trainFile: String, modelFile: String, options: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("train")(trainFile.asInstanceOf[js.Any], modelFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def w2v(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("w2v")().asInstanceOf[js.Any]
}
