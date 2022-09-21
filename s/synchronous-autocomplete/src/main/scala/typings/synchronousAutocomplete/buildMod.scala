package typings.synchronousAutocomplete

import org.scalablytyped.runtime.StringDictionary
import typings.synchronousAutocomplete.mod.NrOfTokens
import typings.synchronousAutocomplete.mod.OriginalIds
import typings.synchronousAutocomplete.mod.Scores
import typings.synchronousAutocomplete.mod.TokenizerFn
import typings.synchronousAutocomplete.mod.Tokens
import typings.synchronousAutocomplete.mod.Weights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  /**
    * Builds an index from a list of items;
    *
    * @example
    * import buildIndex = require('synchronous-autocomplete/build');
    * import createAutocomplete = require('synchronous-autocomplete');
    *
    * const tokenize = (str: string) => str.split(/\s+/g);
    * // create index
    * const { tokens, weights, nrOfTokens, scores, originalIds } = buildIndex(
    *   tokenize,
    *   [
    *     {
    *       id: 'apple',
    *       name: 'Juicy sour Apple.',
    *       weight: 3,
    *     },
    *     {
    *       id: 'banana',
    *       name: 'Sweet juicy Banana!',
    *       weight: 2,
    *     },
    *   ],
    * );
    * // create autocomplete
    * const autocomplete = createAutocomplete(tokens, scores, weights, nrOfTokens, originalIds, tokenize);
    */
  inline def apply[TId /* <: String */](tokenizerFn: TokenizerFn, items: js.Array[Item[TId]]): Index[TId] = (^.asInstanceOf[js.Dynamic].apply(tokenizerFn.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Index[TId]]
  
  @JSImport("synchronous-autocomplete/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Index[TId /* <: String */] extends StObject {
    
    var nrOfTokens: NrOfTokens
    
    var originalIds: OriginalIds[TId]
    
    var scores: Scores
    
    var tokens: Tokens
    
    var weights: Weights
  }
  object Index {
    
    inline def apply[TId /* <: String */](
      nrOfTokens: NrOfTokens,
      originalIds: OriginalIds[TId],
      scores: Scores,
      tokens: Tokens,
      weights: Weights
    ): Index[TId] = {
      val __obj = js.Dynamic.literal(nrOfTokens = nrOfTokens.asInstanceOf[js.Any], originalIds = originalIds.asInstanceOf[js.Any], scores = scores.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[TId]]
    }
    
    extension [Self <: Index[?], TId /* <: String */](x: Self & Index[TId]) {
      
      inline def setNrOfTokens(value: NrOfTokens): Self = StObject.set(x, "nrOfTokens", value.asInstanceOf[js.Any])
      
      inline def setNrOfTokensVarargs(value: Double*): Self = StObject.set(x, "nrOfTokens", js.Array(value*))
      
      inline def setOriginalIds(value: OriginalIds[TId]): Self = StObject.set(x, "originalIds", value.asInstanceOf[js.Any])
      
      inline def setOriginalIdsVarargs(value: TId*): Self = StObject.set(x, "originalIds", js.Array(value*))
      
      inline def setScores(value: Scores): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: Tokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setWeights(value: Weights): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
  
  trait Item[TId /* <: String */]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var id: TId
    
    var name: String
    
    var weight: Double
  }
  object Item {
    
    inline def apply[TId /* <: String */](id: TId, name: String, weight: Double): Item[TId] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[TId]]
    }
    
    extension [Self <: Item[?], TId /* <: String */](x: Self & Item[TId]) {
      
      inline def setId(value: TId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
