package typings.word

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fibMod {
  
  @JSImport("word/dist/typings/codecs/DOC/fib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * [MS-DOC] 2.5.1 Fib
    */
  @scala.inline
  def readFib(buffer: Buffer): Fib = ^.asInstanceOf[js.Dynamic].applyDynamic("readFib")(buffer.asInstanceOf[js.Any]).asInstanceOf[Fib]
  
  trait Fib extends StObject {
    
    var base: FibBase
    
    var fibRgCswNew: js.UndefOr[FibRgCswNew] = js.undefined
    
    var fibRgFcLcbBlob: FibRgFcLcb
    
    var fibRgLw: FibRgLw97
  }
  object Fib {
    
    @scala.inline
    def apply(base: FibBase, fibRgFcLcbBlob: FibRgFcLcb, fibRgLw: FibRgLw97): Fib = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], fibRgFcLcbBlob = fibRgFcLcbBlob.asInstanceOf[js.Any], fibRgLw = fibRgLw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fib]
    }
    
    @scala.inline
    implicit class FibMutableBuilder[Self <: Fib] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: FibBase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFibRgCswNew(value: FibRgCswNew): Self = StObject.set(x, "fibRgCswNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFibRgCswNewUndefined: Self = StObject.set(x, "fibRgCswNew", js.undefined)
      
      @scala.inline
      def setFibRgFcLcbBlob(value: FibRgFcLcb): Self = StObject.set(x, "fibRgFcLcbBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFibRgLw(value: FibRgLw97): Self = StObject.set(x, "fibRgLw", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * [MS-DOC] 2.5.2 FibBase
    */
  trait FibBase extends StObject {
    
    /**
      * G - fWhichTblStm (1 bit): Specifies the Table stream to which the FIB
      * refers. When this value is set to 1, use 1Table; when this value is set to
      * 0, use 0Table.
      */
    var fWhichTblStm: Double
    
    /**
      * nFib (2 bytes): An unsigned integer that specifies the version number of
      * the file format used. Superseded by FibRgCswNew.nFibNew if it is present.
      * This value SHOULD be 0x00C1. Could possibly be 0x00C0 or 0x00C2 but should
      * be treated as if it were 0x00C1.
      */
    var nFib: Double
  }
  object FibBase {
    
    @scala.inline
    def apply(fWhichTblStm: Double, nFib: Double): FibBase = {
      val __obj = js.Dynamic.literal(fWhichTblStm = fWhichTblStm.asInstanceOf[js.Any], nFib = nFib.asInstanceOf[js.Any])
      __obj.asInstanceOf[FibBase]
    }
    
    @scala.inline
    implicit class FibBaseMutableBuilder[Self <: FibBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFWhichTblStm(value: Double): Self = StObject.set(x, "fWhichTblStm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNFib(value: Double): Self = StObject.set(x, "nFib", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * [MS-DOC] 2.5.11 FibRgCswNew
    */
  trait FibRgCswNew extends StObject {
    
    /**
      * nFibNew (2 bytes): An unsigned integer that specifies the version number
      * of the file format that is used. This value MUST be one of the following.
      * 0x00D9, 0x0101, 0x010C, 0x0112.
      */
    var nFibNew: Double
  }
  object FibRgCswNew {
    
    @scala.inline
    def apply(nFibNew: Double): FibRgCswNew = {
      val __obj = js.Dynamic.literal(nFibNew = nFibNew.asInstanceOf[js.Any])
      __obj.asInstanceOf[FibRgCswNew]
    }
    
    @scala.inline
    implicit class FibRgCswNewMutableBuilder[Self <: FibRgCswNew] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNFibNew(value: Double): Self = StObject.set(x, "nFibNew", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * [MS-DOC] 2.5.6 FibRgFcLcb97
    */
  trait FibRgFcLcb extends StObject {
    
    /**
      * fcClx (4 bytes):  An unsigned integer that specifies an offset in the
      * Table Stream. A Clx begins at this offset.
      */
    var fcClx: Double
    
    /**
      * fcPlcfBtePapx (4 bytes): An unsigned integer that specifies an offset in
      * the Table Stream. A PlcBtePapx begins at the offset. fcPlcfBtePapx MUST be
      * greater than zero, and MUST be a valid offset in the Table Stream.
      */
    var fcPlcfBtePapx: Double
    
    /**
      * lcbClx (4 bytes):  An unsigned integer that specifies the size, in bytes,
      * of the Clx at offset fcClx in the Table Stream. This value MUST be greater
      * than zero.
      */
    var lcbClx: Double
    
    /**
      * lcbPlcfBtePapx (4 bytes): An unsigned integer that specifies the size, in
      * bytes, of the PlcBtePapx at offset fcPlcfBtePapx in the Table Stream.
      * lcbPlcfBteChpx MUST be greater than zero.
      */
    var lcbPlcfBtePapx: Double
  }
  object FibRgFcLcb {
    
    @scala.inline
    def apply(fcClx: Double, fcPlcfBtePapx: Double, lcbClx: Double, lcbPlcfBtePapx: Double): FibRgFcLcb = {
      val __obj = js.Dynamic.literal(fcClx = fcClx.asInstanceOf[js.Any], fcPlcfBtePapx = fcPlcfBtePapx.asInstanceOf[js.Any], lcbClx = lcbClx.asInstanceOf[js.Any], lcbPlcfBtePapx = lcbPlcfBtePapx.asInstanceOf[js.Any])
      __obj.asInstanceOf[FibRgFcLcb]
    }
    
    @scala.inline
    implicit class FibRgFcLcbMutableBuilder[Self <: FibRgFcLcb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFcClx(value: Double): Self = StObject.set(x, "fcClx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcPlcfBtePapx(value: Double): Self = StObject.set(x, "fcPlcfBtePapx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcbClx(value: Double): Self = StObject.set(x, "lcbClx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcbPlcfBtePapx(value: Double): Self = StObject.set(x, "lcbPlcfBtePapx", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * [MS-DOC] 2.5.4 FibRgLw97
    */
  trait FibRgLw97 extends StObject {
    
    /**
      * ccpAtn (4 bytes): A signed integer that specifies the count of CPs in the
      * comment subdocument. This value MUST be zero, 1, or greater.
      */
    var ccpAtn: Double
    
    /**
      * ccpEdn (4 bytes): A signed integer that specifies the count of CPs in the
      * endnote subdocument. This value MUST be zero, 1, or greater.
      */
    var ccpEdn: Double
    
    /**
      * ccpFtn (4 bytes): A signed integer that specifies the count of CPs in the
      * footnote subdocument. This value MUST be zero, 1, or greater.
      */
    var ccpFtn: Double
    
    /**
      * ccpHdd (4 bytes): A signed integer that specifies the count of CPs in the
      * header subdocument. This value MUST be zero, 1, or greater.
      */
    var ccpHdd: Double
    
    /**
      * ccpHdrTxbx (4 bytes): A signed integer that specifies the count of CPs in
      * the textbox subdocument of the header. This value MUST be zero, 1, or
      * greater.
      */
    var ccpHdrTxbx: Double
    
    /**
      * ccpText (4 bytes): A signed integer that specifies the count of CPs in the
      * main document. This value MUST be zero, 1, or greater.
      */
    var ccpText: Double
    
    /**
      * ccpTxbx (4 bytes): A signed integer that specifies the count of CPs in the
      * textbox subdocument of the main document. This value MUST be zero, 1, or
      * greater.
      */
    var ccpTxbx: Double
  }
  object FibRgLw97 {
    
    @scala.inline
    def apply(
      ccpAtn: Double,
      ccpEdn: Double,
      ccpFtn: Double,
      ccpHdd: Double,
      ccpHdrTxbx: Double,
      ccpText: Double,
      ccpTxbx: Double
    ): FibRgLw97 = {
      val __obj = js.Dynamic.literal(ccpAtn = ccpAtn.asInstanceOf[js.Any], ccpEdn = ccpEdn.asInstanceOf[js.Any], ccpFtn = ccpFtn.asInstanceOf[js.Any], ccpHdd = ccpHdd.asInstanceOf[js.Any], ccpHdrTxbx = ccpHdrTxbx.asInstanceOf[js.Any], ccpText = ccpText.asInstanceOf[js.Any], ccpTxbx = ccpTxbx.asInstanceOf[js.Any])
      __obj.asInstanceOf[FibRgLw97]
    }
    
    @scala.inline
    implicit class FibRgLw97MutableBuilder[Self <: FibRgLw97] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCcpAtn(value: Double): Self = StObject.set(x, "ccpAtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcpEdn(value: Double): Self = StObject.set(x, "ccpEdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcpFtn(value: Double): Self = StObject.set(x, "ccpFtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcpHdd(value: Double): Self = StObject.set(x, "ccpHdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcpHdrTxbx(value: Double): Self = StObject.set(x, "ccpHdrTxbx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcpText(value: Double): Self = StObject.set(x, "ccpText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcpTxbx(value: Double): Self = StObject.set(x, "ccpTxbx", value.asInstanceOf[js.Any])
    }
  }
}
