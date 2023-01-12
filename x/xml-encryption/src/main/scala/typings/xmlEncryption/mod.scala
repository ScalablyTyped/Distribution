package typings.xmlEncryption

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-encryption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(
    xml: String,
    options: DecryptOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decryptKeyInfo(doc: String, options: DecryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeyInfo")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encrypt(
    content: String,
    options: EncryptOptions,
    callback: js.Function2[/* error */ js.Error, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encryptKeyInfo(
    symmetricKey: String,
    options: EncryptKeyOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeyInfo")(symmetricKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encryptKeyInfo(
    symmetricKey: Buffer,
    options: EncryptKeyOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeyInfo")(symmetricKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DecryptOptions extends StObject {
    
    var disallowDecryptionWithInsecureAlgorithm: js.UndefOr[Boolean] = js.undefined
    
    var key: String | Buffer
    
    var warnInsecureAlgorithm: js.UndefOr[Boolean] = js.undefined
  }
  object DecryptOptions {
    
    inline def apply(key: String | Buffer): DecryptOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecryptOptions] (val x: Self) extends AnyVal {
      
      inline def setDisallowDecryptionWithInsecureAlgorithm(value: Boolean): Self = StObject.set(x, "disallowDecryptionWithInsecureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDisallowDecryptionWithInsecureAlgorithmUndefined: Self = StObject.set(x, "disallowDecryptionWithInsecureAlgorithm", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setWarnInsecureAlgorithm(value: Boolean): Self = StObject.set(x, "warnInsecureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setWarnInsecureAlgorithmUndefined: Self = StObject.set(x, "warnInsecureAlgorithm", js.undefined)
    }
  }
  
  trait EncryptKeyOptions extends StObject {
    
    var disallowEncryptionWithInsecureAlgorithm: js.UndefOr[Boolean] = js.undefined
    
    var keyEncryptionAlgorithm: KeyEncryptionAlgorithm
    
    var pem: String | Buffer
    
    var rsa_pub: String | Buffer
  }
  object EncryptKeyOptions {
    
    inline def apply(keyEncryptionAlgorithm: KeyEncryptionAlgorithm, pem: String | Buffer, rsa_pub: String | Buffer): EncryptKeyOptions = {
      val __obj = js.Dynamic.literal(keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], pem = pem.asInstanceOf[js.Any], rsa_pub = rsa_pub.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptKeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptKeyOptions] (val x: Self) extends AnyVal {
      
      inline def setDisallowEncryptionWithInsecureAlgorithm(value: Boolean): Self = StObject.set(x, "disallowEncryptionWithInsecureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDisallowEncryptionWithInsecureAlgorithmUndefined: Self = StObject.set(x, "disallowEncryptionWithInsecureAlgorithm", js.undefined)
      
      inline def setKeyEncryptionAlgorithm(value: KeyEncryptionAlgorithm): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setPem(value: String | Buffer): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
      
      inline def setRsa_pub(value: String | Buffer): Self = StObject.set(x, "rsa_pub", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptOptions
    extends StObject
       with EncryptKeyOptions {
    
    var encryptionAlgorithm: EncryptionAlgorithm
    
    var input_encoding: js.UndefOr[Utf8AsciiBinaryEncoding] = js.undefined
    
    var warnInsecureAlgorithm: js.UndefOr[Boolean] = js.undefined
  }
  object EncryptOptions {
    
    inline def apply(
      encryptionAlgorithm: EncryptionAlgorithm,
      keyEncryptionAlgorithm: KeyEncryptionAlgorithm,
      pem: String | Buffer,
      rsa_pub: String | Buffer
    ): EncryptOptions = {
      val __obj = js.Dynamic.literal(encryptionAlgorithm = encryptionAlgorithm.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], pem = pem.asInstanceOf[js.Any], rsa_pub = rsa_pub.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
      
      inline def setEncryptionAlgorithm(value: EncryptionAlgorithm): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setInput_encoding(value: Utf8AsciiBinaryEncoding): Self = StObject.set(x, "input_encoding", value.asInstanceOf[js.Any])
      
      inline def setInput_encodingUndefined: Self = StObject.set(x, "input_encoding", js.undefined)
      
      inline def setWarnInsecureAlgorithm(value: Boolean): Self = StObject.set(x, "warnInsecureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setWarnInsecureAlgorithmUndefined: Self = StObject.set(x, "warnInsecureAlgorithm", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc`
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc`
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm`
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm`
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc`
  */
  trait EncryptionAlgorithm extends StObject
  object EncryptionAlgorithm {
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc` = "http://www.w3.org/2001/04/xmlenc#aes128-cbc".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes128-cbc`]
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc` = "http://www.w3.org/2001/04/xmlenc#aes256-cbc".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignaes256-cbc`]
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc` = "http://www.w3.org/2001/04/xmlenc#tripledes-cbc".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersigntripledes-cbc`]
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm` = "http://www.w3.org/2009/xmlenc11#aes128-gcm".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes128-gcm`]
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm` = "http://www.w3.org/2009/xmlenc11#aes256-gcm".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2009Slashxmlenc11Numbersignaes256-gcm`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p`
    - typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5`
  */
  trait KeyEncryptionAlgorithm extends StObject
  object KeyEncryptionAlgorithm {
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5` = "http://www.w3.org/2001/04/xmlenc#rsa-1_5".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-1_5`]
    
    inline def `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p`: typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p` = "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignrsa-oaep-mgf1p`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmlEncryption.xmlEncryptionStrings.utf8
    - typings.xmlEncryption.xmlEncryptionStrings.ascii
    - typings.xmlEncryption.xmlEncryptionStrings.binary
  */
  trait Utf8AsciiBinaryEncoding extends StObject
  object Utf8AsciiBinaryEncoding {
    
    inline def ascii: typings.xmlEncryption.xmlEncryptionStrings.ascii = "ascii".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.ascii]
    
    inline def binary: typings.xmlEncryption.xmlEncryptionStrings.binary = "binary".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.binary]
    
    inline def utf8: typings.xmlEncryption.xmlEncryptionStrings.utf8 = "utf8".asInstanceOf[typings.xmlEncryption.xmlEncryptionStrings.utf8]
  }
}
