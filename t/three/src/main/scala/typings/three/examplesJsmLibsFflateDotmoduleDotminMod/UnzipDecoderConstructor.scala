package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnzipDecoderConstructor
  extends StObject
     with /**
  * Creates an instance of the decoder
  * @param filename The name of the file
  * @param size The compressed size of the file
  * @param originalSize The original size of the file
  */
Instantiable1[/* filename */ String, UnzipDecoder]
     with Instantiable2[/* filename */ String, /* size */ Double, UnzipDecoder]
     with Instantiable3[
      /* filename */ String, 
      (/* size */ Double) | (/* size */ Unit), 
      /* originalSize */ Double, 
      UnzipDecoder
    ] {
  
  /**
    * The compression format for the data stream. This number is determined by
    * the spec in PKZIP's APPNOTE.txt, section 4.4.5. For example, 0 = no
    * compression, 8 = deflate, 14 = LZMA
    */
  var compression: Double = js.native
}
