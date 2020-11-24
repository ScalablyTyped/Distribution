package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.tuyaPanelKit.anon.Bic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevInfo[S] extends js.Object {
  
  var ability: Double = js.native
  
  var activeTime: Double = js.native
  
  /**
    * @deprecated
    */
  var appId: Double = js.native
  
  var appKey: String = js.native
  
  /**
    * @desc 网络是否在线
    */
  var appOnline: Boolean = js.native
  
  var attribute: Double = js.native
  
  var baseAttribute: Double = js.native
  
  var bv: Double = js.native
  
  var capability: Double = js.native
  
  var category: String = js.native
  
  var categoryCode: String = js.native
  
  var cloudOnline: Boolean = js.native
  
  var codeIds: Record[String, String] = js.native
  
  var communication: Record[String, _] = js.native
  
  var devAttribute: Double = js.native
  
  var devId: String = js.native
  
  /**
    * @desc 设备是否在线
    */
  var deviceOnline: Boolean = js.native
  
  var deviceType: Double = js.native
  
  var displayDps: js.Array[_] = js.native
  
  var displayMsgs: Record[String, _] = js.native
  
  var displayOrder: Double = js.native
  
  var dpMaxTime: Double = js.native
  
  var dpName: Record[String | Double, String] = js.native
  
  var dps: Record[Double, String] = js.native
  
  var errorCode: Double = js.native
  
  var faultDps: js.Array[_] = js.native
  
  var gatewayVerCAD: String = js.native
  
  var gwType: String = js.native
  
  var homeDisplayOrder: Double = js.native
  
  var homeId: Double = js.native
  
  var i18nTime: Double = js.native
  
  var iconUrl: String = js.native
  
  var idCodes: Record[Double, String] = js.native
  
  var ip: String = js.native
  
  var isAdmin: Boolean = js.native
  
  var isCloudOnline: Boolean = js.native
  
  /**
    * @desc 局域网是否在线
    */
  var isLocalOnline: Boolean = js.native
  
  var isMeshBleOnline: Boolean = js.native
  
  var isNewFirmware: Boolean = js.native
  
  var isShare: Boolean = js.native
  
  var isUniversalPanel: Boolean = js.native
  
  var isVDevice: Boolean = js.native
  
  var latitude: String = js.native
  
  var localKey: String = js.native
  
  var longitude: String = js.native
  
  var lpv: Double = js.native
  
  var meshId: String = js.native
  
  var name: String = js.native
  
  var networkType: NetworkType = js.native
  
  var originJson: Record[String, _] = js.native
  
  var panelConfig: Bic = js.native
  
  var pcc: String = js.native
  
  var productId: String = js.native
  
  var protocolAttribute: Double = js.native
  
  var pv: Double = js.native
  
  var quickOpDps: js.Array[_] = js.native
  
  var rnFind: Boolean = js.native
  
  var roomId: Double = js.native
  
  var runtimeEnv: String = js.native
  
  var schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo with TopLevel[js.Any] = js.native
  
  var schemaExt: String = js.native
  
  var sharedTime: Double = js.native
  
  var sigmeshId: String = js.native
  
  var standSchemaModel: Record[String, _] = js.native
  
  var standard: Boolean = js.native
  
  var state: S = js.native
  
  var supportGroup: Boolean = js.native
  
  var supportSGroup: Boolean = js.native
  
  var timezoneId: String = js.native
  
  var ui: String = js.native
  
  var uiId: String = js.native
  
  var uiPhase: String = js.native
  
  var uiType: String = js.native
  
  var uiVersion: String = js.native
  
  var upgrading: Boolean = js.native
  
  var uuid: String = js.native
  
  var vendorInfo: String = js.native
  
  var verSw: String = js.native
  
  var virtual: Boolean = js.native
}
object DevInfo {
  
  @scala.inline
  def apply[S](
    ability: Double,
    activeTime: Double,
    appId: Double,
    appKey: String,
    appOnline: Boolean,
    attribute: Double,
    baseAttribute: Double,
    bv: Double,
    capability: Double,
    category: String,
    categoryCode: String,
    cloudOnline: Boolean,
    codeIds: Record[String, String],
    communication: Record[String, _],
    devAttribute: Double,
    devId: String,
    deviceOnline: Boolean,
    deviceType: Double,
    displayDps: js.Array[_],
    displayMsgs: Record[String, _],
    displayOrder: Double,
    dpMaxTime: Double,
    dpName: Record[String | Double, String],
    dps: Record[Double, String],
    errorCode: Double,
    faultDps: js.Array[_],
    gatewayVerCAD: String,
    gwType: String,
    homeDisplayOrder: Double,
    homeId: Double,
    i18nTime: Double,
    iconUrl: String,
    idCodes: Record[Double, String],
    ip: String,
    isAdmin: Boolean,
    isCloudOnline: Boolean,
    isLocalOnline: Boolean,
    isMeshBleOnline: Boolean,
    isNewFirmware: Boolean,
    isShare: Boolean,
    isUniversalPanel: Boolean,
    isVDevice: Boolean,
    latitude: String,
    localKey: String,
    longitude: String,
    lpv: Double,
    meshId: String,
    name: String,
    networkType: NetworkType,
    originJson: Record[String, _],
    panelConfig: Bic,
    pcc: String,
    productId: String,
    protocolAttribute: Double,
    pv: Double,
    quickOpDps: js.Array[_],
    rnFind: Boolean,
    roomId: Double,
    runtimeEnv: String,
    schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo with TopLevel[js.Any],
    schemaExt: String,
    sharedTime: Double,
    sigmeshId: String,
    standSchemaModel: Record[String, _],
    standard: Boolean,
    state: S,
    supportGroup: Boolean,
    supportSGroup: Boolean,
    timezoneId: String,
    ui: String,
    uiId: String,
    uiPhase: String,
    uiType: String,
    uiVersion: String,
    upgrading: Boolean,
    uuid: String,
    vendorInfo: String,
    verSw: String,
    virtual: Boolean
  ): DevInfo[S] = {
    val __obj = js.Dynamic.literal(ability = ability.asInstanceOf[js.Any], activeTime = activeTime.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appKey = appKey.asInstanceOf[js.Any], appOnline = appOnline.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], baseAttribute = baseAttribute.asInstanceOf[js.Any], bv = bv.asInstanceOf[js.Any], capability = capability.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], categoryCode = categoryCode.asInstanceOf[js.Any], cloudOnline = cloudOnline.asInstanceOf[js.Any], codeIds = codeIds.asInstanceOf[js.Any], communication = communication.asInstanceOf[js.Any], devAttribute = devAttribute.asInstanceOf[js.Any], devId = devId.asInstanceOf[js.Any], deviceOnline = deviceOnline.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayDps = displayDps.asInstanceOf[js.Any], displayMsgs = displayMsgs.asInstanceOf[js.Any], displayOrder = displayOrder.asInstanceOf[js.Any], dpMaxTime = dpMaxTime.asInstanceOf[js.Any], dpName = dpName.asInstanceOf[js.Any], dps = dps.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], faultDps = faultDps.asInstanceOf[js.Any], gatewayVerCAD = gatewayVerCAD.asInstanceOf[js.Any], gwType = gwType.asInstanceOf[js.Any], homeDisplayOrder = homeDisplayOrder.asInstanceOf[js.Any], homeId = homeId.asInstanceOf[js.Any], i18nTime = i18nTime.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], idCodes = idCodes.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any], isCloudOnline = isCloudOnline.asInstanceOf[js.Any], isLocalOnline = isLocalOnline.asInstanceOf[js.Any], isMeshBleOnline = isMeshBleOnline.asInstanceOf[js.Any], isNewFirmware = isNewFirmware.asInstanceOf[js.Any], isShare = isShare.asInstanceOf[js.Any], isUniversalPanel = isUniversalPanel.asInstanceOf[js.Any], isVDevice = isVDevice.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], localKey = localKey.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], lpv = lpv.asInstanceOf[js.Any], meshId = meshId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any], originJson = originJson.asInstanceOf[js.Any], panelConfig = panelConfig.asInstanceOf[js.Any], pcc = pcc.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], protocolAttribute = protocolAttribute.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], quickOpDps = quickOpDps.asInstanceOf[js.Any], rnFind = rnFind.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any], runtimeEnv = runtimeEnv.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaExt = schemaExt.asInstanceOf[js.Any], sharedTime = sharedTime.asInstanceOf[js.Any], sigmeshId = sigmeshId.asInstanceOf[js.Any], standSchemaModel = standSchemaModel.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], supportGroup = supportGroup.asInstanceOf[js.Any], supportSGroup = supportSGroup.asInstanceOf[js.Any], timezoneId = timezoneId.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], uiId = uiId.asInstanceOf[js.Any], uiPhase = uiPhase.asInstanceOf[js.Any], uiType = uiType.asInstanceOf[js.Any], uiVersion = uiVersion.asInstanceOf[js.Any], upgrading = upgrading.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendorInfo = vendorInfo.asInstanceOf[js.Any], verSw = verSw.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevInfo[S]]
  }
  
  @scala.inline
  implicit class DevInfoOps[Self <: DevInfo[_], S] (val x: Self with DevInfo[S]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbility(value: Double): Self = this.set("ability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTime(value: Double): Self = this.set("activeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: Double): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppOnline(value: Boolean): Self = this.set("appOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: Double): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseAttribute(value: Double): Self = this.set("baseAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBv(value: Double): Self = this.set("bv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapability(value: Double): Self = this.set("capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryCode(value: String): Self = this.set("categoryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnline(value: Boolean): Self = this.set("cloudOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIds(value: Record[String, String]): Self = this.set("codeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunication(value: Record[String, _]): Self = this.set("communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevAttribute(value: Double): Self = this.set("devAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevId(value: String): Self = this.set("devId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOnline(value: Boolean): Self = this.set("deviceOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: Double): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDpsVarargs(value: js.Any*): Self = this.set("displayDps", js.Array(value :_*))
    
    @scala.inline
    def setDisplayDps(value: js.Array[_]): Self = this.set("displayDps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMsgs(value: Record[String, _]): Self = this.set("displayMsgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOrder(value: Double): Self = this.set("displayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpMaxTime(value: Double): Self = this.set("dpMaxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpName(value: Record[String | Double, String]): Self = this.set("dpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDps(value: Record[Double, String]): Self = this.set("dps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultDpsVarargs(value: js.Any*): Self = this.set("faultDps", js.Array(value :_*))
    
    @scala.inline
    def setFaultDps(value: js.Array[_]): Self = this.set("faultDps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayVerCAD(value: String): Self = this.set("gatewayVerCAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGwType(value: String): Self = this.set("gwType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDisplayOrder(value: Double): Self = this.set("homeDisplayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeId(value: Double): Self = this.set("homeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nTime(value: Double): Self = this.set("i18nTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCodes(value: Record[Double, String]): Self = this.set("idCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdmin(value: Boolean): Self = this.set("isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCloudOnline(value: Boolean): Self = this.set("isCloudOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocalOnline(value: Boolean): Self = this.set("isLocalOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeshBleOnline(value: Boolean): Self = this.set("isMeshBleOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewFirmware(value: Boolean): Self = this.set("isNewFirmware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShare(value: Boolean): Self = this.set("isShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUniversalPanel(value: Boolean): Self = this.set("isUniversalPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVDevice(value: Boolean): Self = this.set("isVDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: String): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalKey(value: String): Self = this.set("localKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: String): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLpv(value: Double): Self = this.set("lpv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshId(value: String): Self = this.set("meshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: NetworkType): Self = this.set("networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginJson(value: Record[String, _]): Self = this.set("originJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelConfig(value: Bic): Self = this.set("panelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcc(value: String): Self = this.set("pcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolAttribute(value: Double): Self = this.set("protocolAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPv(value: Double): Self = this.set("pv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickOpDpsVarargs(value: js.Any*): Self = this.set("quickOpDps", js.Array(value :_*))
    
    @scala.inline
    def setQuickOpDps(value: js.Array[_]): Self = this.set("quickOpDps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRnFind(value: Boolean): Self = this.set("rnFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomId(value: Double): Self = this.set("roomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeEnv(value: String): Self = this.set("runtimeEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
      */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo with TopLevel[js.Any]
    ): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExt(value: String): Self = this.set("schemaExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTime(value: Double): Self = this.set("sharedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigmeshId(value: String): Self = this.set("sigmeshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandSchemaModel(value: Record[String, _]): Self = this.set("standSchemaModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: Boolean): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: S): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportGroup(value: Boolean): Self = this.set("supportGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportSGroup(value: Boolean): Self = this.set("supportSGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneId(value: String): Self = this.set("timezoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: String): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiId(value: String): Self = this.set("uiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiPhase(value: String): Self = this.set("uiPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiType(value: String): Self = this.set("uiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiVersion(value: String): Self = this.set("uiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgrading(value: Boolean): Self = this.set("upgrading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorInfo(value: String): Self = this.set("vendorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerSw(value: String): Self = this.set("verSw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
  }
}
