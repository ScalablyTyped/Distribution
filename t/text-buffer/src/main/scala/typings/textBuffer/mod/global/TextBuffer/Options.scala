package typings.textBuffer.mod.global.TextBuffer

import typings.textBuffer.textBufferStrings.inside
import typings.textBuffer.textBufferStrings.never
import typings.textBuffer.textBufferStrings.overlap
import typings.textBuffer.textBufferStrings.surround
import typings.textBuffer.textBufferStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  The option objects that the user is expected to fill out and provide to
  *  specific API calls.
  */
object Options {
  
  @js.native
  trait BufferLoad extends StObject {
    
    /** The file's encoding. */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      *  A function that returns a boolean indicating whether the buffer should
      *  be destroyed if its file is deleted.
      */
    var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.native
  }
  object BufferLoad {
    
    @scala.inline
    def apply(): BufferLoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferLoad]
    }
    
    @scala.inline
    implicit class BufferLoadMutableBuilder[Self <: BufferLoad] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
    }
  }
  
  @js.native
  trait CopyMarker extends StObject {
    
    /**
      *  Indicates whether insertions at the start or end of the marked range should
      *  be interpreted as happening outside the marker.
      */
    var exclusive: js.UndefOr[Boolean] = js.native
    
    /** Determines the rules by which changes to the buffer invalidate the marker. */
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
    
    /**
      *  Custom properties to be associated with the marker.
      *  @deprecated
      */
    var properties: js.UndefOr[js.Object] = js.native
    
    /** Creates the marker in a reversed orientation. */
    var reversed: js.UndefOr[Boolean] = js.native
    
    /** Whether or not the marker should be tailed. */
    var tailed: js.UndefOr[Boolean] = js.native
  }
  object CopyMarker {
    
    @scala.inline
    def apply(): CopyMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyMarker]
    }
    
    @scala.inline
    implicit class CopyMarkerMutableBuilder[Self <: CopyMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setTailed(value: Boolean): Self = StObject.set(x, "tailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailedUndefined: Self = StObject.set(x, "tailed", js.undefined)
    }
  }
  
  @js.native
  trait FindDisplayMarker extends StObject {
    
    /** Only include markers contained in this Range in buffer coordinates. */
    var containedInBufferRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers contained in this Range in screen coordinates. */
    var containedInScreenRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers containing this Point in buffer coordinates. */
    var containsBufferPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers containing this Range in buffer coordinates. */
    var containsBufferRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers ending at this Point in buffer coordinates. */
    var endBufferPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers ending at this row in buffer coordinates. */
    var endBufferRow: js.UndefOr[Double] = js.native
    
    /** Only include markers ending at this Point in screen coordinates. */
    var endScreenPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers ending at this row in screen coordinates. */
    var endScreenRow: js.UndefOr[Double] = js.native
    
    /** Only include markers ending inside this Range in buffer coordinates. */
    var endsInBufferRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers ending inside this Range in screen coordinates. */
    var endsInScreenRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers intersecting this Range in buffer coordinates. */
    var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.native
    
    /**
      *  Only include markers intersecting this Array of [startRow, endRow] in
      *  buffer coordinates.
      */
    var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /** Only include markers intersecting this Range in screen coordinates. */
    var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.native
    
    /**
      *  Only include markers intersecting this Array of [startRow, endRow] in
      *  screen coordinates.
      */
    var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /** Only include markers starting at this Point in buffer coordinates. */
    var startBufferPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers starting at this row in buffer coordinates. */
    var startBufferRow: js.UndefOr[Double] = js.native
    
    /** Only include markers starting at this Point in screen coordinates. */
    var startScreenPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers starting at this row in screen coordinates. */
    var startScreenRow: js.UndefOr[Double] = js.native
    
    /** Only include markers starting inside this Range in buffer coordinates. */
    var startsInBufferRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers starting inside this Range in screen coordinates. */
    var startsInScreenRange: js.UndefOr[RangeCompatible] = js.native
  }
  object FindDisplayMarker {
    
    @scala.inline
    def apply(): FindDisplayMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindDisplayMarker]
    }
    
    @scala.inline
    implicit class FindDisplayMarkerMutableBuilder[Self <: FindDisplayMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainedInBufferRange(value: RangeCompatible): Self = StObject.set(x, "containedInBufferRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedInBufferRangeUndefined: Self = StObject.set(x, "containedInBufferRange", js.undefined)
      
      @scala.inline
      def setContainedInScreenRange(value: RangeCompatible): Self = StObject.set(x, "containedInScreenRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedInScreenRangeUndefined: Self = StObject.set(x, "containedInScreenRange", js.undefined)
      
      @scala.inline
      def setContainsBufferPosition(value: PointCompatible): Self = StObject.set(x, "containsBufferPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsBufferPositionUndefined: Self = StObject.set(x, "containsBufferPosition", js.undefined)
      
      @scala.inline
      def setContainsBufferRange(value: RangeCompatible): Self = StObject.set(x, "containsBufferRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsBufferRangeUndefined: Self = StObject.set(x, "containsBufferRange", js.undefined)
      
      @scala.inline
      def setEndBufferPosition(value: PointCompatible): Self = StObject.set(x, "endBufferPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndBufferPositionUndefined: Self = StObject.set(x, "endBufferPosition", js.undefined)
      
      @scala.inline
      def setEndBufferRow(value: Double): Self = StObject.set(x, "endBufferRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndBufferRowUndefined: Self = StObject.set(x, "endBufferRow", js.undefined)
      
      @scala.inline
      def setEndScreenPosition(value: PointCompatible): Self = StObject.set(x, "endScreenPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndScreenPositionUndefined: Self = StObject.set(x, "endScreenPosition", js.undefined)
      
      @scala.inline
      def setEndScreenRow(value: Double): Self = StObject.set(x, "endScreenRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndScreenRowUndefined: Self = StObject.set(x, "endScreenRow", js.undefined)
      
      @scala.inline
      def setEndsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "endsInBufferRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsInBufferRangeUndefined: Self = StObject.set(x, "endsInBufferRange", js.undefined)
      
      @scala.inline
      def setEndsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "endsInScreenRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsInScreenRangeUndefined: Self = StObject.set(x, "endsInScreenRange", js.undefined)
      
      @scala.inline
      def setIntersectsBufferRange(value: RangeCompatible): Self = StObject.set(x, "intersectsBufferRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectsBufferRangeUndefined: Self = StObject.set(x, "intersectsBufferRange", js.undefined)
      
      @scala.inline
      def setIntersectsBufferRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsBufferRowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectsBufferRowRangeUndefined: Self = StObject.set(x, "intersectsBufferRowRange", js.undefined)
      
      @scala.inline
      def setIntersectsScreenRange(value: RangeCompatible): Self = StObject.set(x, "intersectsScreenRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectsScreenRangeUndefined: Self = StObject.set(x, "intersectsScreenRange", js.undefined)
      
      @scala.inline
      def setIntersectsScreenRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsScreenRowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectsScreenRowRangeUndefined: Self = StObject.set(x, "intersectsScreenRowRange", js.undefined)
      
      @scala.inline
      def setStartBufferPosition(value: PointCompatible): Self = StObject.set(x, "startBufferPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartBufferPositionUndefined: Self = StObject.set(x, "startBufferPosition", js.undefined)
      
      @scala.inline
      def setStartBufferRow(value: Double): Self = StObject.set(x, "startBufferRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartBufferRowUndefined: Self = StObject.set(x, "startBufferRow", js.undefined)
      
      @scala.inline
      def setStartScreenPosition(value: PointCompatible): Self = StObject.set(x, "startScreenPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartScreenPositionUndefined: Self = StObject.set(x, "startScreenPosition", js.undefined)
      
      @scala.inline
      def setStartScreenRow(value: Double): Self = StObject.set(x, "startScreenRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartScreenRowUndefined: Self = StObject.set(x, "startScreenRow", js.undefined)
      
      @scala.inline
      def setStartsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "startsInBufferRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsInBufferRangeUndefined: Self = StObject.set(x, "startsInBufferRange", js.undefined)
      
      @scala.inline
      def setStartsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "startsInScreenRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsInScreenRangeUndefined: Self = StObject.set(x, "startsInScreenRange", js.undefined)
    }
  }
  
  @js.native
  trait FindMarker extends StObject {
    
    /** Only include markers that contain the given Point, inclusive. */
    var containsPoint: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers that contain the given Range, inclusive. */
    var containsRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers that end at the given Point. */
    var endPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers that end at the given row number. */
    var endRow: js.UndefOr[Double] = js.native
    
    /** Only include markers that end inside the given Range. */
    var endsInRange: js.UndefOr[RangeCompatible] = js.native
    
    /** Only include markers that intersect the given row number. */
    var intersectsRow: js.UndefOr[Double] = js.native
    
    /** Only include markers that start at the given Point. */
    var startPosition: js.UndefOr[PointCompatible] = js.native
    
    /** Only include markers that start at the given row number. */
    var startRow: js.UndefOr[Double] = js.native
    
    /** Only include markers that start inside the given Range. */
    var startsInRange: js.UndefOr[RangeCompatible] = js.native
  }
  object FindMarker {
    
    @scala.inline
    def apply(): FindMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindMarker]
    }
    
    @scala.inline
    implicit class FindMarkerMutableBuilder[Self <: FindMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainsPoint(value: PointCompatible): Self = StObject.set(x, "containsPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsPointUndefined: Self = StObject.set(x, "containsPoint", js.undefined)
      
      @scala.inline
      def setContainsRange(value: RangeCompatible): Self = StObject.set(x, "containsRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsRangeUndefined: Self = StObject.set(x, "containsRange", js.undefined)
      
      @scala.inline
      def setEndPosition(value: PointCompatible): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
      
      @scala.inline
      def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
      
      @scala.inline
      def setEndsInRange(value: RangeCompatible): Self = StObject.set(x, "endsInRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsInRangeUndefined: Self = StObject.set(x, "endsInRange", js.undefined)
      
      @scala.inline
      def setIntersectsRow(value: Double): Self = StObject.set(x, "intersectsRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectsRowUndefined: Self = StObject.set(x, "intersectsRow", js.undefined)
      
      @scala.inline
      def setStartPosition(value: PointCompatible): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      @scala.inline
      def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
      
      @scala.inline
      def setStartsInRange(value: RangeCompatible): Self = StObject.set(x, "startsInRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsInRangeUndefined: Self = StObject.set(x, "startsInRange", js.undefined)
    }
  }
  
  @js.native
  trait ScanContext extends StObject {
    
    /** The number of lines before the matched line to include in the results object. */
    var leadingContextLineCount: js.UndefOr[Double] = js.native
    
    /** The number of lines after the matched line to include in the results object. */
    var trailingContextLineCount: js.UndefOr[Double] = js.native
  }
  object ScanContext {
    
    @scala.inline
    def apply(): ScanContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanContext]
    }
    
    @scala.inline
    implicit class ScanContextMutableBuilder[Self <: ScanContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeadingContextLineCount(value: Double): Self = StObject.set(x, "leadingContextLineCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingContextLineCountUndefined: Self = StObject.set(x, "leadingContextLineCount", js.undefined)
      
      @scala.inline
      def setTrailingContextLineCount(value: Double): Self = StObject.set(x, "trailingContextLineCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingContextLineCountUndefined: Self = StObject.set(x, "trailingContextLineCount", js.undefined)
    }
  }
}
