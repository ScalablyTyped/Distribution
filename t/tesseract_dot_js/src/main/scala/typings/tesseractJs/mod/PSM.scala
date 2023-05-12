package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PSM extends StObject
@JSImport("tesseract.js", "PSM")
@js.native
object PSM extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PSM & String] = js.native
  
  @js.native
  sealed trait AUTO
    extends StObject
       with PSM
  /* "3" */ val AUTO: typings.tesseractJs.mod.PSM.AUTO & String = js.native
  
  @js.native
  sealed trait AUTO_ONLY
    extends StObject
       with PSM
  /* "2" */ val AUTO_ONLY: typings.tesseractJs.mod.PSM.AUTO_ONLY & String = js.native
  
  @js.native
  sealed trait AUTO_OSD
    extends StObject
       with PSM
  /* "1" */ val AUTO_OSD: typings.tesseractJs.mod.PSM.AUTO_OSD & String = js.native
  
  @js.native
  sealed trait CIRCLE_WORD
    extends StObject
       with PSM
  /* "9" */ val CIRCLE_WORD: typings.tesseractJs.mod.PSM.CIRCLE_WORD & String = js.native
  
  @js.native
  sealed trait OSD_ONLY
    extends StObject
       with PSM
  /* "0" */ val OSD_ONLY: typings.tesseractJs.mod.PSM.OSD_ONLY & String = js.native
  
  @js.native
  sealed trait RAW_LINE
    extends StObject
       with PSM
  /* "13" */ val RAW_LINE: typings.tesseractJs.mod.PSM.RAW_LINE & String = js.native
  
  @js.native
  sealed trait SINGLE_BLOCK
    extends StObject
       with PSM
  /* "6" */ val SINGLE_BLOCK: typings.tesseractJs.mod.PSM.SINGLE_BLOCK & String = js.native
  
  @js.native
  sealed trait SINGLE_BLOCK_VERT_TEXT
    extends StObject
       with PSM
  /* "5" */ val SINGLE_BLOCK_VERT_TEXT: typings.tesseractJs.mod.PSM.SINGLE_BLOCK_VERT_TEXT & String = js.native
  
  @js.native
  sealed trait SINGLE_CHAR
    extends StObject
       with PSM
  /* "10" */ val SINGLE_CHAR: typings.tesseractJs.mod.PSM.SINGLE_CHAR & String = js.native
  
  @js.native
  sealed trait SINGLE_COLUMN
    extends StObject
       with PSM
  /* "4" */ val SINGLE_COLUMN: typings.tesseractJs.mod.PSM.SINGLE_COLUMN & String = js.native
  
  @js.native
  sealed trait SINGLE_LINE
    extends StObject
       with PSM
  /* "7" */ val SINGLE_LINE: typings.tesseractJs.mod.PSM.SINGLE_LINE & String = js.native
  
  @js.native
  sealed trait SINGLE_WORD
    extends StObject
       with PSM
  /* "8" */ val SINGLE_WORD: typings.tesseractJs.mod.PSM.SINGLE_WORD & String = js.native
  
  @js.native
  sealed trait SPARSE_TEXT
    extends StObject
       with PSM
  /* "11" */ val SPARSE_TEXT: typings.tesseractJs.mod.PSM.SPARSE_TEXT & String = js.native
  
  @js.native
  sealed trait SPARSE_TEXT_OSD
    extends StObject
       with PSM
  /* "12" */ val SPARSE_TEXT_OSD: typings.tesseractJs.mod.PSM.SPARSE_TEXT_OSD & String = js.native
}
