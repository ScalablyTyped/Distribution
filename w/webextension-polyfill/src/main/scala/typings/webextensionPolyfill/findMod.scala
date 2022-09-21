package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMod {
  
  object Find {
    
    /**
      * Search parameters.
      */
    trait FindParamsType extends StObject {
      
      /**
        * Find only ranges with case sensitive match.
        * Optional.
        */
      var caseSensitive: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Find only ranges that match entire word.
        * Optional.
        */
      var entireWord: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Return range data which provides range data in a serializable form.
        * Optional.
        */
      var includeRangeData: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Return rectangle data which describes visual position of search results.
        * Optional.
        */
      var includeRectData: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Tab to query. Defaults to the active tab.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
    }
    object FindParamsType {
      
      inline def apply(): FindParamsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FindParamsType]
      }
      
      extension [Self <: FindParamsType](x: Self) {
        
        inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
        
        inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
        
        inline def setEntireWord(value: Boolean): Self = StObject.set(x, "entireWord", value.asInstanceOf[js.Any])
        
        inline def setEntireWordUndefined: Self = StObject.set(x, "entireWord", js.undefined)
        
        inline def setIncludeRangeData(value: Boolean): Self = StObject.set(x, "includeRangeData", value.asInstanceOf[js.Any])
        
        inline def setIncludeRangeDataUndefined: Self = StObject.set(x, "includeRangeData", js.undefined)
        
        inline def setIncludeRectData(value: Boolean): Self = StObject.set(x, "includeRectData", value.asInstanceOf[js.Any])
        
        inline def setIncludeRectDataUndefined: Self = StObject.set(x, "includeRectData", js.undefined)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      }
    }
    
    trait FindResult extends StObject {
      
      /**
        * The number of results found.
        */
      var count: Double
      
      /**
        * If includeRangeData was given in the options parameter, then this property will be included.
        * It is provided as an array of RangeData objects, one for each match. Each RangeData object describes where in the DOM
        * tree the match was found. This would enable, for example, an extension to get the text surrounding each match,
        * so as to display context for the matches. The items correspond to the items given in rectData, so rangeData[i]
        * describes the same match as rectData[i].
        * Optional.
        */
      var rangeData: js.UndefOr[js.Array[RangeData]] = js.undefined
      
      /**
        * If includeRectData was given in the options parameter, then this property will be included.
        * It is an array of RectData objects. It contains client rectangles for all the text matched in the search,
        * relative to the top-left of the viewport. Extensions can use this to provide custom highlighting of the results.
        * Optional.
        */
      var rectData: js.UndefOr[js.Array[RectData]] = js.undefined
    }
    object FindResult {
      
      inline def apply(count: Double): FindResult = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindResult]
      }
      
      extension [Self <: FindResult](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setRangeData(value: js.Array[RangeData]): Self = StObject.set(x, "rangeData", value.asInstanceOf[js.Any])
        
        inline def setRangeDataUndefined: Self = StObject.set(x, "rangeData", js.undefined)
        
        inline def setRangeDataVarargs(value: RangeData*): Self = StObject.set(x, "rangeData", js.Array(value*))
        
        inline def setRectData(value: js.Array[RectData]): Self = StObject.set(x, "rectData", value.asInstanceOf[js.Any])
        
        inline def setRectDataUndefined: Self = StObject.set(x, "rectData", js.undefined)
        
        inline def setRectDataVarargs(value: RectData*): Self = StObject.set(x, "rectData", js.Array(value*))
      }
    }
    
    /**
      * highlightResults parameters
      */
    trait HighlightResultsParamsType extends StObject {
      
      /**
        * Don't scroll to highlighted item.
        * Optional.
        */
      var noScroll: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Found range to be highlighted. Default highlights all ranges.
        * Optional.
        */
      var rangeIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * Tab to highlight. Defaults to the active tab.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
    }
    object HighlightResultsParamsType {
      
      inline def apply(): HighlightResultsParamsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HighlightResultsParamsType]
      }
      
      extension [Self <: HighlightResultsParamsType](x: Self) {
        
        inline def setNoScroll(value: Boolean): Self = StObject.set(x, "noScroll", value.asInstanceOf[js.Any])
        
        inline def setNoScrollUndefined: Self = StObject.set(x, "noScroll", js.undefined)
        
        inline def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
        
        inline def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      }
    }
    
    trait RangeData extends StObject {
      
      /**
        * The ordinal string position of the end of the matched word within end text node.
        */
      var endOffset: Double
      
      /**
        * The ordinal position of the text node in which the match ended.
        */
      var endTextNodePos: Double
      
      /**
        * The index of the frame containing the match. 0 corresponds to the parent window. Note that the order of objects in the
        * rangeData array will sequentially line up with the order of frame indexes: for example,
        * framePos for the first sequence of rangeData objects will be 0, framePos for the next sequence will be 1, and so on.
        */
      var framePos: Double
      
      /**
        * The ordinal string position of the start of the matched word within start text node.
        * If match word include in single text node, Extension can get match word between startOffset and endOffset string index
        * in the single text node.
        */
      var startOffset: Double
      
      /**
        * The ordinal position of the text node in which the match started.
        */
      var startTextNodePos: Double
    }
    object RangeData {
      
      inline def apply(
        endOffset: Double,
        endTextNodePos: Double,
        framePos: Double,
        startOffset: Double,
        startTextNodePos: Double
      ): RangeData = {
        val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], endTextNodePos = endTextNodePos.asInstanceOf[js.Any], framePos = framePos.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTextNodePos = startTextNodePos.asInstanceOf[js.Any])
        __obj.asInstanceOf[RangeData]
      }
      
      extension [Self <: RangeData](x: Self) {
        
        inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
        
        inline def setEndTextNodePos(value: Double): Self = StObject.set(x, "endTextNodePos", value.asInstanceOf[js.Any])
        
        inline def setFramePos(value: Double): Self = StObject.set(x, "framePos", value.asInstanceOf[js.Any])
        
        inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
        
        inline def setStartTextNodePos(value: Double): Self = StObject.set(x, "startTextNodePos", value.asInstanceOf[js.Any])
      }
    }
    
    trait RectData extends StObject {
      
      /**
        * The index of the frame containing the match. 0 corresponds to the parent window. Note that the order of objects in the
        * rangeData array will sequentially line up with the order of frame indexes: for example,
        * framePos for the first sequence of rangeData objects will be 0, framePos for the next sequence will be 1, and so on.
        */
      var rectsAndTexts: RectsAndTexts
      
      /**
        * The complete text of the match.
        */
      var text: String
    }
    object RectData {
      
      inline def apply(rectsAndTexts: RectsAndTexts, text: String): RectData = {
        val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[RectData]
      }
      
      extension [Self <: RectData](x: Self) {
        
        inline def setRectsAndTexts(value: RectsAndTexts): Self = StObject.set(x, "rectsAndTexts", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    trait Rectangle extends StObject {
      
      /**
        * Pixels from the bottom.
        */
      var bottom: Double
      
      /**
        * Pixels from the left.
        */
      var left: Double
      
      /**
        * Pixels from the right.
        */
      var right: Double
      
      /**
        * Pixels from the top.
        */
      var top: Double
    }
    object Rectangle {
      
      inline def apply(bottom: Double, left: Double, right: Double, top: Double): Rectangle = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rectangle]
      }
      
      extension [Self <: Rectangle](x: Self) {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
    
    trait RectsAndTexts extends StObject {
      
      /**
        * Rectangles relative to the top-left of the viewport.
        */
      var rectList: js.Array[Rectangle]
      
      /**
        * an array of strings, corresponding to the rectList array. The entry at textList[i]
        * contains the part of the match bounded by the rectangle at rectList[i].
        */
      var textList: js.Array[String]
    }
    object RectsAndTexts {
      
      inline def apply(rectList: js.Array[Rectangle], textList: js.Array[String]): RectsAndTexts = {
        val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
        __obj.asInstanceOf[RectsAndTexts]
      }
      
      extension [Self <: RectsAndTexts](x: Self) {
        
        inline def setRectList(value: js.Array[Rectangle]): Self = StObject.set(x, "rectList", value.asInstanceOf[js.Any])
        
        inline def setRectListVarargs(value: Rectangle*): Self = StObject.set(x, "rectList", js.Array(value*))
        
        inline def setTextList(value: js.Array[String]): Self = StObject.set(x, "textList", value.asInstanceOf[js.Any])
        
        inline def setTextListVarargs(value: String*): Self = StObject.set(x, "textList", js.Array(value*))
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Search for text in document and store found ranges in array, in document order.
        *
        * @param queryphrase The string to search for.
        * @param params Optional. Search parameters.
        */
      def find(queryphrase: String): js.Promise[FindResult] = js.native
      def find(queryphrase: String, params: FindParamsType): js.Promise[FindResult] = js.native
      
      /**
        * Highlight a range
        *
        * @param params Optional. highlightResults parameters
        */
      def highlightResults(): js.Promise[Unit] = js.native
      def highlightResults(params: HighlightResultsParamsType): js.Promise[Unit] = js.native
      
      /**
        * Remove all highlighting from previous searches.
        *
        * @param tabId Optional. Tab to highlight. Defaults to the active tab.
        */
      def removeHighlighting(): js.Promise[Unit] = js.native
      def removeHighlighting(tabId: Double): js.Promise[Unit] = js.native
    }
  }
}
