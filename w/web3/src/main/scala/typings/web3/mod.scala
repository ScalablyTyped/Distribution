package typings.web3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.netMod.Socket
import typings.web3Bzz.mod.Bzz
import typings.web3Core.mod.BatchRequest
import typings.web3Core.mod.Extension
import typings.web3Core.mod.Providers
import typings.web3Core.mod.provider
import typings.web3Eth.mod.Eth
import typings.web3EthPersonal.mod.Personal
import typings.web3Net.mod.Network
import typings.web3Shh.mod.Shh
import typings.web3Utils.mod.Utils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Web3 {
    def this(provider: typings.web3Core.mod.provider) = this()
    def this(provider: typings.web3Core.mod.provider, net: Socket) = this()
    
    /* CompleteClass */
    var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest] = js.native
    
    /* CompleteClass */
    var bzz: Bzz = js.native
    
    /* CompleteClass */
    override val currentProvider: typings.web3Core.mod.provider = js.native
    
    /* CompleteClass */
    var defaultAccount: String | Null = js.native
    
    /* CompleteClass */
    var defaultBlock: String | Double = js.native
    
    /* CompleteClass */
    var eth: Eth = js.native
    
    /* CompleteClass */
    override def extend(`extension`: Extension): js.Any = js.native
    
    /* CompleteClass */
    override val givenProvider: js.Any = js.native
    
    /* CompleteClass */
    override def setProvider(provider: typings.web3Core.mod.provider): Boolean = js.native
    
    /* CompleteClass */
    var shh: Shh = js.native
    
    /* CompleteClass */
    var utils: Utils = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("web3", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("web3", "default.givenProvider")
    @js.native
    val givenProvider: js.Any = js.native
    
    @JSImport("web3", "default.modules")
    @js.native
    def modules: Modules = js.native
    @scala.inline
    def modules_=(x: Modules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("web3", "default.providers")
    @js.native
    val providers: Providers = js.native
    
    @JSImport("web3", "default.utils")
    @js.native
    val utils: Utils = js.native
    
    @JSImport("web3", "default.version")
    @js.native
    val version: String = js.native
  }
  
  trait Modules extends StObject {
    
    var Bzz: Instantiable1[/* provider */ provider, typings.web3Bzz.mod.Bzz]
    
    var Eth: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3Eth.mod.Eth]
    
    var Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network]
    
    var Personal: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3EthPersonal.mod.Personal]
    
    var Shh: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3Shh.mod.Shh]
  }
  object Modules {
    
    @scala.inline
    def apply(
      Bzz: Instantiable1[/* provider */ provider, Bzz],
      Eth: Instantiable2[/* provider */ provider, /* net */ Socket, Eth],
      Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network],
      Personal: Instantiable2[/* provider */ provider, /* net */ Socket, Personal],
      Shh: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]
    ): Modules = {
      val __obj = js.Dynamic.literal(Bzz = Bzz.asInstanceOf[js.Any], Eth = Eth.asInstanceOf[js.Any], Net = Net.asInstanceOf[js.Any], Personal = Personal.asInstanceOf[js.Any], Shh = Shh.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modules]
    }
    
    @scala.inline
    implicit class ModulesMutableBuilder[Self <: Modules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBzz(value: Instantiable1[/* provider */ provider, Bzz]): Self = StObject.set(x, "Bzz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEth(value: Instantiable2[/* provider */ provider, /* net */ Socket, Eth]): Self = StObject.set(x, "Eth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNet(value: Instantiable2[/* provider */ provider, /* net */ Socket, Network]): Self = StObject.set(x, "Net", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonal(value: Instantiable2[/* provider */ provider, /* net */ Socket, Personal]): Self = StObject.set(x, "Personal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShh(value: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]): Self = StObject.set(x, "Shh", value.asInstanceOf[js.Any])
    }
  }
  
  trait Web3 extends StObject {
    
    var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest]
    
    var bzz: Bzz
    
    val currentProvider: provider
    
    var defaultAccount: String | Null
    
    var defaultBlock: String | Double
    
    var eth: Eth
    
    def extend(`extension`: Extension): js.Any
    
    val givenProvider: js.Any
    
    def setProvider(provider: provider): Boolean
    
    var shh: Shh
    
    var utils: Utils
    
    var version: String
  }
  object Web3 {
    
    @scala.inline
    def apply(
      BatchRequest: Instantiable0[BatchRequest],
      bzz: Bzz,
      defaultBlock: String | Double,
      eth: Eth,
      extend: Extension => js.Any,
      givenProvider: js.Any,
      setProvider: provider => Boolean,
      shh: Shh,
      utils: Utils,
      version: String
    ): Web3 = {
      val __obj = js.Dynamic.literal(BatchRequest = BatchRequest.asInstanceOf[js.Any], bzz = bzz.asInstanceOf[js.Any], defaultBlock = defaultBlock.asInstanceOf[js.Any], eth = eth.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), givenProvider = givenProvider.asInstanceOf[js.Any], setProvider = js.Any.fromFunction1(setProvider), shh = shh.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], currentProvider = null, defaultAccount = null)
      __obj.asInstanceOf[Web3]
    }
    
    @scala.inline
    implicit class Web3MutableBuilder[Self <: Web3] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchRequest(value: Instantiable0[BatchRequest]): Self = StObject.set(x, "BatchRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBzz(value: Bzz): Self = StObject.set(x, "bzz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentProvider(value: provider): Self = StObject.set(x, "currentProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentProviderNull: Self = StObject.set(x, "currentProvider", null)
      
      @scala.inline
      def setDefaultAccount(value: String): Self = StObject.set(x, "defaultAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAccountNull: Self = StObject.set(x, "defaultAccount", null)
      
      @scala.inline
      def setDefaultBlock(value: String | Double): Self = StObject.set(x, "defaultBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEth(value: Eth): Self = StObject.set(x, "eth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtend(value: Extension => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGivenProvider(value: js.Any): Self = StObject.set(x, "givenProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetProvider(value: provider => Boolean): Self = StObject.set(x, "setProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShh(value: Shh): Self = StObject.set(x, "shh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtils(value: Utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
