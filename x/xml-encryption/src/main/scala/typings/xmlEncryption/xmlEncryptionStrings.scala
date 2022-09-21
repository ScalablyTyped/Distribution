package typings.xmlEncryption

import typings.xmlEncryption.mod.EncryptionAlgorithm
import typings.xmlEncryption.mod.KeyEncryptionAlgorithm
import typings.xmlEncryption.mod.Utf8AsciiBinaryEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlEncryptionStrings {
  
  @js.native
  sealed trait ascii
    extends StObject
       with Utf8AsciiBinaryEncoding
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait binary
    extends StObject
       with Utf8AsciiBinaryEncoding
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc`
    extends StObject
       with EncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc`: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc` = "http://www.w3.org/2001/04/xmlenc#aes128-cbc".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc`]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc`
    extends StObject
       with EncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc`: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc` = "http://www.w3.org/2001/04/xmlenc#aes256-cbc".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc`]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5`
    extends StObject
       with KeyEncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5`: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5` = "http://www.w3.org/2001/04/xmlenc#rsa-1_5".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5`]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p`
    extends StObject
       with KeyEncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p`: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p` = "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p`]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc`
    extends StObject
       with EncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc`: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc` = "http://www.w3.org/2001/04/xmlenc#tripledes-cbc".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc`]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm`
    extends StObject
       with EncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm`: `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm` = "http://www.w3.org/2009/xmlenc11#aes128-gcm".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm`]
  
  @js.native
  sealed trait `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm`
    extends StObject
       with EncryptionAlgorithm
  inline def `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm`: `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm` = "http://www.w3.org/2009/xmlenc11#aes256-gcm".asInstanceOf[`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm`]
  
  @js.native
  sealed trait utf8
    extends StObject
       with Utf8AsciiBinaryEncoding
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
