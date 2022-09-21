package typings.wuzzy

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wuzzy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jaccard(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccard")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jaccard(a: String, b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccard")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jaccard(a: js.Array[String], b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccard")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jaccard(a: js.Array[String], b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccard")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def jarowinkler(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: String, b: String, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: String, b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: String, b: js.Array[String], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: js.Array[String], b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: js.Array[String], b: String, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: js.Array[String], b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def jarowinkler(a: js.Array[String], b: js.Array[String], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jarowinkler")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def levenshtein(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: String, b: String, options: LevenshteinOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: String, b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: String, b: js.Array[String], options: LevenshteinOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: js.Array[String], b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: js.Array[String], b: String, options: LevenshteinOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: js.Array[String], b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def levenshtein(a: js.Array[String], b: js.Array[String], options: LevenshteinOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ngram(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: String, b: String, ng: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ng.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: String, b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: String, b: js.Array[String], ng: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ng.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: js.Array[String], b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: js.Array[String], b: String, ng: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ng.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: js.Array[String], b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ngram(a: js.Array[String], b: js.Array[String], ng: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ngram")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ng.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def pearson(a: Record[String, Double], b: Record[String, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pearson")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tanimoto(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tanimoto")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def tanimoto(a: String, b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tanimoto")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def tanimoto(a: js.Array[String], b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tanimoto")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def tanimoto(a: js.Array[String], b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tanimoto")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait LevenshteinOptions extends StObject {
    
    var d: Double
    
    var i: Double
    
    var s: Double
  }
  object LevenshteinOptions {
    
    inline def apply(d: Double, i: Double, s: Double): LevenshteinOptions = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[LevenshteinOptions]
    }
    
    extension [Self <: LevenshteinOptions](x: Self) {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
