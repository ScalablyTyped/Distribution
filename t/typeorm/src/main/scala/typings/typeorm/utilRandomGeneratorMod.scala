package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilRandomGeneratorMod {
  
  @JSImport("typeorm/util/RandomGenerator", "RandomGenerator")
  @js.native
  class RandomGenerator () extends StObject
  /* static members */
  object RandomGenerator {
    
    @JSImport("typeorm/util/RandomGenerator", "RandomGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  discuss at: http://locutus.io/php/sha1/
      * original by: Webtoolkit.info (http://www.webtoolkit.info/)
      * improved by: Michael White (http://getsprink.com)
      * improved by: Kevin van Zonneveld (http://kvz.io)
      *    input by: Brett Zamir (http://brett-zamir.me)
      *      note 1: Keep in mind that in accordance with PHP, the whole string is buffered and then
      *      note 1: hashed. If available, we'd recommend using Node's native crypto modules directly
      *      note 1: in a steaming fashion for faster and more efficient hashing
      *   example 1: sha1('Kevin van Zonneveld')
      *   returns 1: '54916d2e62f65b3afa6e192e6a601cdbe5cb5897'
      */
    @scala.inline
    def sha1(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * RFC4122 compliant UUID v4 generator.
      */
    @scala.inline
    def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  }
}
