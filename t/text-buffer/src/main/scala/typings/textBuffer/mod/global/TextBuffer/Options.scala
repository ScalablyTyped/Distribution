package typings.textBuffer.mod.global.TextBuffer

import typings.textBuffer.textBufferStrings.inside
import typings.textBuffer.textBufferStrings.never
import typings.textBuffer.textBufferStrings.overlap
import typings.textBuffer.textBufferStrings.surround
import typings.textBuffer.textBufferStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  The option objects that the user is expected to fill out and provide to
  *  specific API calls.
  */
object Options {
  
  trait BufferLoad extends StObject {
    
    /** The file's encoding. */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      *  A function that returns a boolean indicating whether the buffer should
      *  be destroyed if its file is deleted.
      */
    var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  }
  object BufferLoad {
    
    inline def apply(): BufferLoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferLoad]
    }
    
    extension [Self <: BufferLoad](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
      
      inline def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
    }
  }
  
  trait CopyMarker extends StObject {
    
    /**
      *  Indicates whether insertions at the start or end of the marked range should
      *  be interpreted as happening outside the marker.
      */
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /** Determines the rules by which changes to the buffer invalidate the marker. */
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
    
    /**
      *  Custom properties to be associated with the marker.
      *  @deprecated
      */
    var properties: js.UndefOr[js.Object] = js.undefined
    
    /** Creates the marker in a reversed orientation. */
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not the marker should be tailed. */
    var tailed: js.UndefOr[Boolean] = js.undefined
  }
  object CopyMarker {
    
    inline def apply(): CopyMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyMarker]
    }
    
    extension [Self <: CopyMarker](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setTailed(value: Boolean): Self = StObject.set(x, "tailed", value.asInstanceOf[js.Any])
      
      inline def setTailedUndefined: Self = StObject.set(x, "tailed", js.undefined)
    }
  }
  
  trait FindDisplayMarker extends StObject {
    
    /** Only include markers contained in this Range in buffer coordinates. */
    var containedInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers contained in this Range in screen coordinates. */
    var containedInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers containing this Point in buffer coordinates. */
    var containsBufferPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers containing this Range in buffer coordinates. */
    var containsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers ending at this Point in buffer coordinates. */
    var endBufferPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers ending at this row in buffer coordinates. */
    var endBufferRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers ending at this Point in screen coordinates. */
    var endScreenPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers ending at this row in screen coordinates. */
    var endScreenRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers ending inside this Range in buffer coordinates. */
    var endsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers ending inside this Range in screen coordinates. */
    var endsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers intersecting this Range in buffer coordinates. */
    var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /**
      *  Only include markers intersecting this Array of [startRow, endRow] in
      *  buffer coordinates.
      */
    var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /** Only include markers intersecting this Range in screen coordinates. */
    var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /**
      *  Only include markers intersecting this Array of [startRow, endRow] in
      *  screen coordinates.
      */
    var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /** Only include markers starting at this Point in buffer coordinates. */
    var startBufferPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers starting at this row in buffer coordinates. */
    var startBufferRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers starting at this Point in screen coordinates. */
    var startScreenPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers starting at this row in screen coordinates. */
    var startScreenRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers starting inside this Range in buffer coordinates. */
    var startsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers starting inside this Range in screen coordinates. */
    var startsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  }
  object FindDisplayMarker {
    
    inline def apply(): FindDisplayMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindDisplayMarker]
    }
    
    extension [Self <: FindDisplayMarker](x: Self) {
      
      inline def setContainedInBufferRange(value: RangeCompatible): Self = StObject.set(x, "containedInBufferRange", value.asInstanceOf[js.Any])
      
      inline def setContainedInBufferRangeUndefined: Self = StObject.set(x, "containedInBufferRange", js.undefined)
      
      inline def setContainedInScreenRange(value: RangeCompatible): Self = StObject.set(x, "containedInScreenRange", value.asInstanceOf[js.Any])
      
      inline def setContainedInScreenRangeUndefined: Self = StObject.set(x, "containedInScreenRange", js.undefined)
      
      inline def setContainsBufferPosition(value: PointCompatible): Self = StObject.set(x, "containsBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setContainsBufferPositionUndefined: Self = StObject.set(x, "containsBufferPosition", js.undefined)
      
      inline def setContainsBufferRange(value: RangeCompatible): Self = StObject.set(x, "containsBufferRange", value.asInstanceOf[js.Any])
      
      inline def setContainsBufferRangeUndefined: Self = StObject.set(x, "containsBufferRange", js.undefined)
      
      inline def setEndBufferPosition(value: PointCompatible): Self = StObject.set(x, "endBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setEndBufferPositionUndefined: Self = StObject.set(x, "endBufferPosition", js.undefined)
      
      inline def setEndBufferRow(value: Double): Self = StObject.set(x, "endBufferRow", value.asInstanceOf[js.Any])
      
      inline def setEndBufferRowUndefined: Self = StObject.set(x, "endBufferRow", js.undefined)
      
      inline def setEndScreenPosition(value: PointCompatible): Self = StObject.set(x, "endScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setEndScreenPositionUndefined: Self = StObject.set(x, "endScreenPosition", js.undefined)
      
      inline def setEndScreenRow(value: Double): Self = StObject.set(x, "endScreenRow", value.asInstanceOf[js.Any])
      
      inline def setEndScreenRowUndefined: Self = StObject.set(x, "endScreenRow", js.undefined)
      
      inline def setEndsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "endsInBufferRange", value.asInstanceOf[js.Any])
      
      inline def setEndsInBufferRangeUndefined: Self = StObject.set(x, "endsInBufferRange", js.undefined)
      
      inline def setEndsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "endsInScreenRange", value.asInstanceOf[js.Any])
      
      inline def setEndsInScreenRangeUndefined: Self = StObject.set(x, "endsInScreenRange", js.undefined)
      
      inline def setIntersectsBufferRange(value: RangeCompatible): Self = StObject.set(x, "intersectsBufferRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsBufferRangeUndefined: Self = StObject.set(x, "intersectsBufferRange", js.undefined)
      
      inline def setIntersectsBufferRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsBufferRowRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsBufferRowRangeUndefined: Self = StObject.set(x, "intersectsBufferRowRange", js.undefined)
      
      inline def setIntersectsScreenRange(value: RangeCompatible): Self = StObject.set(x, "intersectsScreenRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsScreenRangeUndefined: Self = StObject.set(x, "intersectsScreenRange", js.undefined)
      
      inline def setIntersectsScreenRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsScreenRowRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsScreenRowRangeUndefined: Self = StObject.set(x, "intersectsScreenRowRange", js.undefined)
      
      inline def setStartBufferPosition(value: PointCompatible): Self = StObject.set(x, "startBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setStartBufferPositionUndefined: Self = StObject.set(x, "startBufferPosition", js.undefined)
      
      inline def setStartBufferRow(value: Double): Self = StObject.set(x, "startBufferRow", value.asInstanceOf[js.Any])
      
      inline def setStartBufferRowUndefined: Self = StObject.set(x, "startBufferRow", js.undefined)
      
      inline def setStartScreenPosition(value: PointCompatible): Self = StObject.set(x, "startScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setStartScreenPositionUndefined: Self = StObject.set(x, "startScreenPosition", js.undefined)
      
      inline def setStartScreenRow(value: Double): Self = StObject.set(x, "startScreenRow", value.asInstanceOf[js.Any])
      
      inline def setStartScreenRowUndefined: Self = StObject.set(x, "startScreenRow", js.undefined)
      
      inline def setStartsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "startsInBufferRange", value.asInstanceOf[js.Any])
      
      inline def setStartsInBufferRangeUndefined: Self = StObject.set(x, "startsInBufferRange", js.undefined)
      
      inline def setStartsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "startsInScreenRange", value.asInstanceOf[js.Any])
      
      inline def setStartsInScreenRangeUndefined: Self = StObject.set(x, "startsInScreenRange", js.undefined)
    }
  }
  
  trait FindMarker extends StObject {
    
    /** Only include markers that contain the given Point, inclusive. */
    var containsPoint: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers that contain the given Range, inclusive. */
    var containsRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers that end at the given Point. */
    var endPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers that end at the given row number. */
    var endRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers that end inside the given Range. */
    var endsInRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers that intersect the given row number. */
    var intersectsRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers that start at the given Point. */
    var startPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers that start at the given row number. */
    var startRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers that start inside the given Range. */
    var startsInRange: js.UndefOr[RangeCompatible] = js.undefined
  }
  object FindMarker {
    
    inline def apply(): FindMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindMarker]
    }
    
    extension [Self <: FindMarker](x: Self) {
      
      inline def setContainsPoint(value: PointCompatible): Self = StObject.set(x, "containsPoint", value.asInstanceOf[js.Any])
      
      inline def setContainsPointUndefined: Self = StObject.set(x, "containsPoint", js.undefined)
      
      inline def setContainsRange(value: RangeCompatible): Self = StObject.set(x, "containsRange", value.asInstanceOf[js.Any])
      
      inline def setContainsRangeUndefined: Self = StObject.set(x, "containsRange", js.undefined)
      
      inline def setEndPosition(value: PointCompatible): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
      
      inline def setEndsInRange(value: RangeCompatible): Self = StObject.set(x, "endsInRange", value.asInstanceOf[js.Any])
      
      inline def setEndsInRangeUndefined: Self = StObject.set(x, "endsInRange", js.undefined)
      
      inline def setIntersectsRow(value: Double): Self = StObject.set(x, "intersectsRow", value.asInstanceOf[js.Any])
      
      inline def setIntersectsRowUndefined: Self = StObject.set(x, "intersectsRow", js.undefined)
      
      inline def setStartPosition(value: PointCompatible): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
      
      inline def setStartsInRange(value: RangeCompatible): Self = StObject.set(x, "startsInRange", value.asInstanceOf[js.Any])
      
      inline def setStartsInRangeUndefined: Self = StObject.set(x, "startsInRange", js.undefined)
    }
  }
  
  trait ScanContext extends StObject {
    
    /** The number of lines before the matched line to include in the results object. */
    var leadingContextLineCount: js.UndefOr[Double] = js.undefined
    
    /** The number of lines after the matched line to include in the results object. */
    var trailingContextLineCount: js.UndefOr[Double] = js.undefined
  }
  object ScanContext {
    
    inline def apply(): ScanContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanContext]
    }
    
    extension [Self <: ScanContext](x: Self) {
      
      inline def setLeadingContextLineCount(value: Double): Self = StObject.set(x, "leadingContextLineCount", value.asInstanceOf[js.Any])
      
      inline def setLeadingContextLineCountUndefined: Self = StObject.set(x, "leadingContextLineCount", js.undefined)
      
      inline def setTrailingContextLineCount(value: Double): Self = StObject.set(x, "trailingContextLineCount", value.asInstanceOf[js.Any])
      
      inline def setTrailingContextLineCountUndefined: Self = StObject.set(x, "trailingContextLineCount", js.undefined)
    }
  }
}
