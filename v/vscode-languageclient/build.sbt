organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-92043d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "vscode" % "1.24-dt-20190322Z-0bf5b0",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-e9f14d",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-823f59",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-6de151")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        