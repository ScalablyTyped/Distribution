package typings.yandexMoneySdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Allowed extends StObject {
    
    var allowed: Boolean
  }
  object Allowed {
    
    inline def apply(allowed: Boolean): Allowed = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Allowed]
    }
    
    extension [Self <: Allowed](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Amount extends StObject {
    
    var amount: Double
    
    var datetime: String
    
    var direction: String
    
    var label: js.UndefOr[String] = js.undefined
    
    var operation_id: String
    
    var pattern_id: js.UndefOr[String] = js.undefined
    
    var status: String
    
    var title: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Amount {
    
    inline def apply(
      amount: Double,
      datetime: String,
      direction: String,
      operation_id: String,
      status: String,
      title: String
    ): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], operation_id = operation_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    extension [Self <: Amount](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOperation_id(value: String): Self = StObject.set(x, "operation_id", value.asInstanceOf[js.Any])
      
      inline def setPattern_id(value: String): Self = StObject.set(x, "pattern_id", value.asInstanceOf[js.Any])
      
      inline def setPattern_idUndefined: Self = StObject.set(x, "pattern_id", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Article extends StObject {
    
    var article: js.Array[MerchantArticleId]
    
    var bonus: js.Array[Secret]
  }
  object Article {
    
    inline def apply(article: js.Array[MerchantArticleId], bonus: js.Array[Secret]): Article = {
      val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Article]
    }
    
    extension [Self <: Article](x: Self) {
      
      inline def setArticle(value: js.Array[MerchantArticleId]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setArticleVarargs(value: MerchantArticleId*): Self = StObject.set(x, "article", js.Array(value*))
      
      inline def setBonus(value: js.Array[Secret]): Self = StObject.set(x, "bonus", value.asInstanceOf[js.Any])
      
      inline def setBonusVarargs(value: Secret*): Self = StObject.set(x, "bonus", js.Array(value*))
    }
  }
  
  trait Available extends StObject {
    
    var available: Double
    
    var blocked: js.UndefOr[Double] = js.undefined
    
    var debt: js.UndefOr[Double] = js.undefined
    
    var deposition_pending: js.UndefOr[Double] = js.undefined
    
    var hold: js.UndefOr[Double] = js.undefined
    
    var total: Double
  }
  object Available {
    
    inline def apply(available: Double, total: Double): Available = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Available]
    }
    
    extension [Self <: Available](x: Self) {
      
      inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
      
      inline def setDebt(value: Double): Self = StObject.set(x, "debt", value.asInstanceOf[js.Any])
      
      inline def setDebtUndefined: Self = StObject.set(x, "debt", js.undefined)
      
      inline def setDeposition_pending(value: Double): Self = StObject.set(x, "deposition_pending", value.asInstanceOf[js.Any])
      
      inline def setDeposition_pendingUndefined: Self = StObject.set(x, "deposition_pending", js.undefined)
      
      inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cards extends StObject {
    
    var cards: js.UndefOr[Cscrequired] = js.undefined
    
    var wallet: js.UndefOr[Allowed] = js.undefined
  }
  object Cards {
    
    inline def apply(): Cards = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cards]
    }
    
    extension [Self <: Cards](x: Self) {
      
      inline def setCards(value: Cscrequired): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
      
      inline def setWallet(value: Allowed): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
      
      inline def setWalletUndefined: Self = StObject.set(x, "wallet", js.undefined)
    }
  }
  
  trait Cscrequired extends StObject {
    
    var allowed: Boolean
    
    var csc_required: Boolean
    
    var items: js.Array[Id]
  }
  object Cscrequired {
    
    inline def apply(allowed: Boolean, csc_required: Boolean, items: js.Array[Id]): Cscrequired = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], csc_required = csc_required.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cscrequired]
    }
    
    extension [Self <: Cscrequired](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setCsc_required(value: Boolean): Self = StObject.set(x, "csc_required", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Id]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Id*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var MD: String
    
    var PaReq: String
  }
  object Dictkey {
    
    inline def apply(MD: String, PaReq: String): Dictkey = {
      val __obj = js.Dynamic.literal(MD = MD.asInstanceOf[js.Any], PaReq = PaReq.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setMD(value: String): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setPaReq(value: String): Self = StObject.set(x, "PaReq", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var pan_fragment: String
    
    var `type`: String
  }
  object Id {
    
    inline def apply(id: String, pan_fragment: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pan_fragment = pan_fragment.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPan_fragment(value: String): Self = StObject.set(x, "pan_fragment", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MerchantArticleId extends StObject {
    
    var merchantArticleId: String
    
    var secret: String
    
    var serial: String
  }
  object MerchantArticleId {
    
    inline def apply(merchantArticleId: String, secret: String, serial: String): MerchantArticleId = {
      val __obj = js.Dynamic.literal(merchantArticleId = merchantArticleId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MerchantArticleId]
    }
    
    extension [Self <: MerchantArticleId](x: Self) {
      
      inline def setMerchantArticleId(value: String): Self = StObject.set(x, "merchantArticleId", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    }
  }
  
  trait Moneysourcetoken extends StObject {
    
    var money_source_token: js.UndefOr[String] = js.undefined
    
    var pan_fragment: js.UndefOr[String] = js.undefined
    
    var payment_card_type: String
    
    var `type`: String
  }
  object Moneysourcetoken {
    
    inline def apply(payment_card_type: String, `type`: String): Moneysourcetoken = {
      val __obj = js.Dynamic.literal(payment_card_type = payment_card_type.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Moneysourcetoken]
    }
    
    extension [Self <: Moneysourcetoken](x: Self) {
      
      inline def setMoney_source_token(value: String): Self = StObject.set(x, "money_source_token", value.asInstanceOf[js.Any])
      
      inline def setMoney_source_tokenUndefined: Self = StObject.set(x, "money_source_token", js.undefined)
      
      inline def setPan_fragment(value: String): Self = StObject.set(x, "pan_fragment", value.asInstanceOf[js.Any])
      
      inline def setPan_fragmentUndefined: Self = StObject.set(x, "pan_fragment", js.undefined)
      
      inline def setPayment_card_type(value: String): Self = StObject.set(x, "payment_card_type", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Panfragment extends StObject {
    
    var pan_fragment: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Panfragment {
    
    inline def apply(): Panfragment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Panfragment]
    }
    
    extension [Self <: Panfragment](x: Self) {
      
      inline def setPan_fragment(value: String): Self = StObject.set(x, "pan_fragment", value.asInstanceOf[js.Any])
      
      inline def setPan_fragmentUndefined: Self = StObject.set(x, "pan_fragment", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Secret extends StObject {
    
    var secret: String
    
    var serial: String
  }
  object Secret {
    
    inline def apply(secret: String, serial: String): Secret = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Secret]
    }
    
    extension [Self <: Secret](x: Self) {
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ts extends StObject {
    
    var ts: String
    
    var url: String
  }
  object Ts {
    
    inline def apply(ts: String, url: String): Ts = {
      val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ts]
    }
    
    extension [Self <: Ts](x: Self) {
      
      inline def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
